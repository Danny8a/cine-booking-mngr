package com.cine.service.user;

import com.cine.model.User;
import com.cine.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<User> getUserById(Long id) {
        return this.userRepository.findById(id);
    }

    @Override
    @Transactional
    public User saveUser(User user) {
        return this.userRepository.save(user);
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        this.userRepository.deleteById(id);
    }
}
