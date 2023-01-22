package com.softuni.mobilele2023.repository;

import com.softuni.mobilele2023.domain.entities.BrandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<BrandEntity, String> {
}
