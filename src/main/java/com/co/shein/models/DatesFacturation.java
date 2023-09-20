package com.co.shein.models;

public class DatesFacturation {
    private  String name;
    private  String year;
    private  String month;
    private  String target;
    private  String city;
    private  String country;

    public DatesFacturation(String name, String year, String month, String target, String city, String country) {
        this.name = name;
        this.year = year;
        this.month = month;
        this.target = target;
        this.city = city;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
