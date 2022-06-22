package com.spring.practice.api.repo;

import com.spring.practice.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepo extends JpaRepository<User,Long> {
}
