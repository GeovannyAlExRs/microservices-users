package com.company.dtk.microservicesusers.service;

import com.company.dtk.microservicesusers.model.Users;
import com.company.dtk.microservicesusers.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public List<Users> findAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users createUsers(Users users) {
        users.setDate(LocalDateTime.now());
        return usersRepository.save(users);
    }

    @Override
    public Optional<Users> findByUsername(String username) {
        return usersRepository.findByUsername(username);
    }

    @Override
    public void deleteUsers(Long id) {
        usersRepository.deleteById(id);
    }
}
