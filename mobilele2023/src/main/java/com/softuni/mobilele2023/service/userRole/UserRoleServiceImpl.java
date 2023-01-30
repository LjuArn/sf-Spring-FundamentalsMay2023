package com.softuni.mobilele2023.service.userRole;

import com.softuni.mobilele2023.repository.UserRoleRepository;
import com.softuni.mobilele2023.service.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl implements UserRoleService, DataBaseInitService {

    private final UserRoleRepository userRoleRepository;

    public UserRoleServiceImpl(UserRoleRepository userRoleRepository) {
        this.userRoleRepository = userRoleRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isdbInit() {
        return this.userRoleRepository.count() > 0;
    }
}
