package com.company.dtk.microservicesusers.repository;

import com.company.dtk.microservicesusers.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findAllByUsersId(Long userId);
}
