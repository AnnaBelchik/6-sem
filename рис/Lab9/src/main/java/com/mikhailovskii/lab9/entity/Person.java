package com.mikhailovskii.lab9.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Optional;

@Entity
@Table(name = "person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String surname;
    private String name;
    private String lastName;

    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date dateOfBirth;
    private String passwordSeries;
    private int city;

    @Column(name = "addressFact", nullable = false)
    private String addressFact;
    private String phoneNumber;
    private String email;
    private boolean isEmployed;
    private String position;
    private String addressRegistration;
    private int citizenShip;

    public Person(String surname, String name, String lastName, Date dateOfBirth, String passwordSeries, int city, String addressFact, String phoneNumber, String email, boolean isEmployed, String position, String addressRegistration, int citizenShip) {
        this.surname = surname;
        this.name = name;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.passwordSeries = passwordSeries;
        this.city = city;
        this.addressFact = addressFact;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.isEmployed = isEmployed;
        this.position = position;
        this.addressRegistration = addressRegistration;
        this.citizenShip = citizenShip;
    }

    public Person() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPasswordSeries() {
        return passwordSeries;
    }

    public void setPasswordSeries(String passwordSeries) {
        this.passwordSeries = passwordSeries;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getAddressFact() {
        return addressFact;
    }

    public void setAddressFact(String addressFact) {
        this.addressFact = addressFact;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Optional<Boolean> isEmployed() {
        return Optional.of(isEmployed);
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public String getAddressRegistration() {
        return addressRegistration;
    }

    public void setAddressRegistration(String addressRegistration) {
        this.addressRegistration = addressRegistration;
    }

    public int getCitizenShip() {
        return citizenShip;
    }

    public void setCitizenShip(int citizenShip) {
        this.citizenShip = citizenShip;
    }

    public Optional<String> getPosition() {
        return Optional.ofNullable(position);
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public boolean areFieldsValid() {
        return this.surname != null
                && this.name != null
                && this.lastName != null
                && this.dateOfBirth != null
                && this.passwordSeries != null
                && this.addressFact != null
                && this.addressRegistration != null;
    }

}
