package com.softuni.mobilele2023.service;

import com.softuni.mobilele2023.service.userRole.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class DataBaseInitServiceImpl implements DataBaseInitService {



    @Override
    public void dbInit() {

    }

    @Override
    public boolean isdbInit() {

        return false;
    }
}
