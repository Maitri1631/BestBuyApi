package com.BestBuy.model;

import java.security.PrivateKey;
import java.util.List;

public class StorePojo {


    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    private double lng;
    private String Name;

    private String Type;


    private String Address;

    private String Address2;

    private String City;

    private String State;

    private String Zip;

    private double late;

    private String hours;

    private int crateddate;

    private int updatedate;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String address2) {
        Address2 = address2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }

    public double getLate() {
        return late;
    }

    public void setLate(double late) {
        this.late = late;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public int getCrateddate() {
        return crateddate;
    }

    public void setCrateddate(int crateddate) {
        this.crateddate = crateddate;
    }

    public int getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(int updatedate) {
        this.updatedate = updatedate;
    }

    public List<String> getServices() {
        return Services;
    }

    public void setServices(List<String> services) {
        Services = services;
    }

    private List<String> Services;

    private List<String> storeService;

    public List<String> getStoreService() {
        return storeService;
    }

    public void setStoreService(List<String> storeService) {
        this.storeService = storeService;
    }


}
