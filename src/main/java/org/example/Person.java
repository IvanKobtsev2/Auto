package org.example;

import java.time.LocalDate;

public class Person {
    private final String driverLicenseNumber;
    private final String lastName;
    private final String firstName;
    private final String middleName;
    private final LocalDate birthDate;
    private final String registrationAddress;

    public Person (String driverLicenseNumber,String lastName,String firstName,
                   String middleName,LocalDate birthDate,String registrationAddress){
        this.driverLicenseNumber = driverLicenseNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.registrationAddress = registrationAddress;
    }

    public String getDriverLicenseNumber() {
        return driverLicenseNumber;
    }
    public String getLastName() {
        return lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getRegistrationAddress() {
        return registrationAddress;
    }

    @Override
    public String toString() {
        return "\n Driver license number:" + driverLicenseNumber +
                "\n Last name:" + lastName +
                "\n First name:" + firstName +
                "\n Middle name:" + middleName +
                "\n Birth date:" + birthDate +
                "\n Registration address:" + registrationAddress + '\n';}
}