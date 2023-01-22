package com.softuni.mobilele2023.domain.entities;

import com.softuni.mobilele2023.domain.enums.EngineEnum;
import com.softuni.mobilele2023.domain.enums.TransmissionEnum;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "offers")
public class OfferEntity extends BaseEntity{

    @Column
    private String description;

    @Column(name="engine")
    @Enumerated(EnumType.STRING)
    private EngineEnum engineEnum;

    @Column(name = "image_url")
    private String imageUrl;

    @Column
    private Integer mileage;

    @Column
    private BigDecimal price;

    @Column(name="transmission")
    @Enumerated(EnumType.STRING)
    private TransmissionEnum transmissionEnum;

    @Column
    private Integer year;

    @Column
    private Date created;

    @Column
    private Date modified;


    @ManyToOne
    @JoinColumn(name = "model_id")
    private ModelEntity model;


    @ManyToOne
    @JoinColumn(name = "seller_id")
    private UserEntity seller;

    public OfferEntity() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EngineEnum getEngineEnum() {
        return engineEnum;
    }

    public void setEngineEnum(EngineEnum engineEnum) {
        this.engineEnum = engineEnum;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public TransmissionEnum getTransmissionEnum() {
        return transmissionEnum;
    }

    public void setTransmissionEnum(TransmissionEnum transmissionEnum) {
        this.transmissionEnum = transmissionEnum;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public ModelEntity getModel() {
        return model;
    }

    public void setModel(ModelEntity model) {
        this.model = model;
    }

    public UserEntity getSeller() {
        return seller;
    }

    public void setSeller(UserEntity seller) {
        this.seller = seller;
    }
}
//•	description – some text.
//•	engine – enumerated value (GASOLINE, DIESEL, ELECTRIC, HYBRID).
//•	imageUrl – the url of image.
//•	mileage – a number.
//•	price – the price of the offer.
//•	transmission – enumerated value (MANUAL, AUTOMATIC).
//•	year – the year of offered car.
//•	created – a date and time.
//•	modified – a date and time.
//•	model – the model of a car.
//•	seller – a user that sells the car.