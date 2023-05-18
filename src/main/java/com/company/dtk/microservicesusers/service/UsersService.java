package com.company.dtk.microservicesusers.service;

import com.company.dtk.microservicesusers.model.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {
    List<Users> findAllUsers();

    Users createUsers(Users users);

    Optional<Users> findByUsername(String username);

    void deleteUsers(Long id);
}
