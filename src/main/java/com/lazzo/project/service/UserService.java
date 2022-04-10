package com.lazzo.project.service;

import com.lazzo.project.dto.UserRegistrationDto;
import com.lazzo.project.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto registrationDto);
}
