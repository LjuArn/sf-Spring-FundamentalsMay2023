package com.softuni.mobilele2023.repository;

import com.softuni.mobilele2023.domain.entities.OfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfferRepository extends JpaRepository<OfferEntity, String> {
}
