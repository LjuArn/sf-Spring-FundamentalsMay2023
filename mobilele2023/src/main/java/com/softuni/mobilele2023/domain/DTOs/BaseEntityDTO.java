package com.softuni.mobilele2023.domain.DTOs;

public abstract class BaseEntityDTO {

    private String id;

    public BaseEntityDTO() {
    }

    public String getId() {
        return id;
    }

    public BaseEntityDTO setId(String id) {
        this.id = id;
        return this;
    }
}
