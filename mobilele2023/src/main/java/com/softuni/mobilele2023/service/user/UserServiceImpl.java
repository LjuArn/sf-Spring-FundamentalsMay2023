package com.softuni.mobilele2023.service.user;

import com.softuni.mobilele2023.repository.UserRepository;
import com.softuni.mobilele2023.service.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService, DataBaseInitService {

   private  final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isdbInit() {
        return this.userRepository.count()>0;
    }
}
