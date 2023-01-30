package com.softuni.mobilele2023.service.model;

import com.softuni.mobilele2023.repository.ModelRepository;
import com.softuni.mobilele2023.service.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class ModelServiceImpl implements ModelService, DataBaseInitService {

    private final ModelRepository modelRepository;

    public ModelServiceImpl(ModelRepository modelRepository) {
        this.modelRepository = modelRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isdbInit() {
        return this.modelRepository.count() > 0;
    }
}
