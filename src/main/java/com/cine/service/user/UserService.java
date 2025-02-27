package com.cine.service.user;

import com.cine.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getAllUsers();

    Optional<User> getUserById(Long id);

    User saveUser(User user);

    void deleteUser(Long id);
}
