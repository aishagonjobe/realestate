package net.yorksolutions.realestate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties

public class RealEstate {
    public Long getId() {
        return id;
    }

    @Id
            @GeneratedValue()
    @JsonProperty
    Long id;

    @JsonProperty
    String street;

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    @JsonProperty
    String city;
    @JsonProperty
    String state;
    @JsonProperty
    int zip;
}

