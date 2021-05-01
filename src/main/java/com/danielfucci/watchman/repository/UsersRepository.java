package com.danielfucci.watchman.repository;

import com.danielfucci.watchman.domain.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<User, Integer> {
}
