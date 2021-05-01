package com.danielfucci.watchman.service;

import com.danielfucci.watchman.domain.model.User;

public interface UserService {
    Iterable<User> getAll();
}
