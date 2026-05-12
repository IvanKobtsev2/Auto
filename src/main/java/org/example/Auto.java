package org.example;

import java.util.List;

public class Auto {
    private final String brand;
    private final String manufacturer;
    private final String model;
    private final String bodyType;
    private final int year;
    private final String vin;
    private final String color;
    private final String licensePlate;
    private final String technicalCondition;
    private final List<Person> owners;
    private final List<Person> authorizedDrivers;

    public Auto(String brand, String manufacturer, String model, String bodyType, int year,
                String vin, String color, String licensePlate, String technicalCondition,
                List<Person> owners, List<Person> authorizedDrivers) {
        this.brand = brand;
        this.manufacturer = manufacturer;
        this.model = model;
        this.bodyType = bodyType;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.licensePlate = licensePlate;
        this.technicalCondition = technicalCondition;
        this.owners = owners;
        this.authorizedDrivers = authorizedDrivers;
    }

    public String getBrand() {
        return brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getYear() {
        return year;
    }

    public String getVin() {
        return vin;
    }

    public String getColor() {
        return color;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getTechnicalCondition() {
        return technicalCondition;
    }

    public List<Person> getOwners() {
        return owners;
    }

    public List<Person> getAuthorizedDrivers() {
        return authorizedDrivers;
    }

    @Override
    public String toString() {
        return "\n Auto:" +
                "\n Brand: " + brand +
                "\n Manufacturer: " + manufacturer +
                "\n Model: " + model +
                "\n Year: " + year +
                "\n VIN: " + vin +
                "\n Color: " + color +
                "\n License Plate: " + licensePlate +
                "\n Technical Condition: " + technicalCondition + '\n' +
                "\n Owners: " + '\n' + owners + '\n' +
                "\n Authorized Drivers: " + '\n' + authorizedDrivers;
    }
}