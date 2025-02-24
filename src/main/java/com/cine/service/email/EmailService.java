package com.cine.service.email;

import com.amazonaws.services.simpleemail.AmazonSimpleEmailService;
import com.amazonaws.services.simpleemail.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Objects;

@Service
public class EmailService {

    @Autowired
    private AmazonSimpleEmailService amazonSimpleEmailService;

    public void sendEmail(SimpleMailMessage message) {
        Destination destination = new Destination();
        destination.setToAddresses(Arrays.asList(Objects.requireNonNull(message.getTo())));

        Content content = new Content();
        content.setData(message.getText());

        Body body = new Body();
        body.setText(content);

        Content subject = new Content();
        subject.setData(message.getSubject());

        Message emailMessage = new Message();
        emailMessage.setBody(body);
        emailMessage.setSubject(subject);

        SendEmailRequest request = new SendEmailRequest();
        request.setDestination(destination);
        request.setMessage(emailMessage);
        request.setSource(message.getFrom());

        amazonSimpleEmailService.sendEmail(request);
    }
}
