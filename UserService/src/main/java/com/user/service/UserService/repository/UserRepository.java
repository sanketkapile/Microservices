package com.user.service.UserService.repository;

import com.user.service.UserService.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
