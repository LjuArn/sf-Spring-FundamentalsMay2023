package com.softuni.mobilele2023.domain.DTOs;

import java.util.Date;

public class BrandDTO extends BaseEntityDTO{

    private String name;

    private Date created;

    private Date modified;



    public String getName() {
        return name;
    }

    public BrandDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Date getCreated() {
        return created;
    }

    public BrandDTO setCreated(Date created) {
        this.created = created;
        return this;
    }

    public Date getModified() {
        return modified;
    }

    public BrandDTO setModified(Date modified) {
        this.modified = modified;
        return this;
    }
}
