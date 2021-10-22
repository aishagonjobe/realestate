package net.yorksolutions.realestate.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@JsonIgnoreProperties

public class RealEstate {
    public Long getId() {
        return id;
    }

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty
    Long id;
    @JsonProperty
    String city;
    @JsonProperty
    String state;
    @JsonProperty
    int zip;
    @JsonProperty
    String street;
    @JsonProperty
    String fname;
    @JsonProperty
    String lname;
    @JsonProperty
    String yrblt;
    @JsonProperty
    boolean isnew;
    @JsonProperty
    int sqft;
    @JsonProperty
    int beds;
    @JsonProperty
    int baths;
    @JsonProperty
    String listing;

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

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getYrblt() {
        return yrblt;
    }

    public void setYrblt(String yrblt) {
        this.yrblt = yrblt;
    }

    public boolean isIsnew() {
        return isnew;
    }

    public void setIsnew(boolean isnew) {
        this.isnew = isnew;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public String getListing() {
        return listing;
    }

    public void setListing(String listing) {
        this.listing = listing;
    }
}

