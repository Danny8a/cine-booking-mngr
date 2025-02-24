package com.cine.service.schedule;

import com.cine.model.ScheduleAvaible;
import com.cine.repository.ScheduleAvaibleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SheduleAvaibleServiceImpl implements SheduleAvaibleService {

    private final ScheduleAvaibleRepository scheduleAvaibleRepository;

    @Autowired
    public SheduleAvaibleServiceImpl(ScheduleAvaibleRepository scheduleAvaibleRepository) {
        this.scheduleAvaibleRepository = scheduleAvaibleRepository;
    }

    @Override
    @Transactional
    public List<ScheduleAvaible> getScheduleAvaible() {
        return this.scheduleAvaibleRepository.findAll();
    }
}
