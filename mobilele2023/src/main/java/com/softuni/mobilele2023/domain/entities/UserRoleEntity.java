package com.softuni.mobilele2023.domain.entities;

import com.softuni.mobilele2023.domain.enums.RoleEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "roles")
public class UserRoleEntity extends BaseEntity {

    @Column(name = "name", nullable = false)
    @Enumerated(EnumType.STRING)
    private RoleEnum roleEnum;

    public UserRoleEntity() {
    }

    public RoleEnum getRoleEnum() {
        return roleEnum;
    }

    public void setRoleEnum(RoleEnum roleEnum) {
        this.roleEnum = roleEnum;
    }
}
