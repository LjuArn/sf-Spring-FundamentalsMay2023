package com.softuni.mobilele2023.service.offer;

import com.softuni.mobilele2023.repository.OfferRepository;
import com.softuni.mobilele2023.service.DataBaseInitService;
import org.springframework.stereotype.Service;

@Service
public class OfferServiceImpl implements OfferService, DataBaseInitService {

    private final OfferRepository offerRepository;

    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public void dbInit() {

    }

    @Override
    public boolean isdbInit() {
        return this.offerRepository.count() > 0;
    }
}
