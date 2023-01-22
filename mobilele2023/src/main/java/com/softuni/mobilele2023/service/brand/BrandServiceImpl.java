package com.softuni.mobilele2023.service.brand;


import com.softuni.mobilele2023.repository.BrandRepository;
import com.softuni.mobilele2023.service.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class BrandServiceImpl implements BrandService, DataBaseInitService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isdbInit() {
        return this.brandRepository.count() > 0;
    }
}
