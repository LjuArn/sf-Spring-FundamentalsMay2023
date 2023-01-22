package com.softuni.mobilele2023.domain.entities;

import com.softuni.mobilele2023.domain.enums.RoleEnum;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Column(nullable = false)
    private String	username;

    @Column
    private String	password;

    @Column(name = "first_name", nullable = false)
    private String	firstName;

    @Column(name = "last_name", nullable = false)
    private String	lastName;

    @Column(name = "is_active")
    private boolean isActive;

    @OneToMany
    private List<UserRoleEntity> userRole;

    @Column(name = "image_url")
    private String imageUrl;

    @Column
    private Date created;

    @Column
    private Date modified;

    public UserEntity() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public List<UserRoleEntity> getUserRole() {
        return userRole;
    }

    public void setUserRole(List<UserRoleEntity> userRole) {
        this.userRole = userRole;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
//•	username – username of the user.
//•	password – password of the user.
//•	firstName –  first name of the user.
//•	lastName –  last name of the user.
//•	isActive – true OR false.
//•	role –  user's role (User or Admin).
//•	imageUrl – a url of user's picture.
//•	created – a date and time.
//•	modified – a date and time.