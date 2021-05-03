package com.danielfucci.watchman.service.implementation;

import com.danielfucci.watchman.domain.model.User;
import com.danielfucci.watchman.repository.UsersRepository;
import com.danielfucci.watchman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UsersRepository usersRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public Iterable<User> getAll() {
        return usersRepository.findAll();
    }

    @Override
    public void register(User newUser) {
        newUser.setPassword(passwordEncoder.encode(newUser.getPassword()));
        usersRepository.save(newUser);
    }
}
