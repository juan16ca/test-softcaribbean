package com.softcaribbean.apiclients.models.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long serial;

    @Column(length = 120)
    private Long identificationNumber;

    @Column(length = 120)
    private String names;

    @Column(length = 120)
    private String lastName;

    @Column(length = 120)
    private String direction;

    @Column(length = 120)
    private String email;

    @Column(length = 20)
    private String telephone;

    @Column(length = 20)
    private String telephoneAditional;

    @Column(length = 20)
    private String phone;

    private int position;

    @Column(length = 120)
    private String descriptionPosition;

    private int city;

    @Column(length = 120)
    private String descriptionCity;

    private Date birthDay;

    @Column(length = 1)
    private String gender;

    private int community;

    @Column(length = 120)
    private String descripcionCommunity;

    @Column(length = 200)
    private String companyName;

    private int divition;

    @Column(length = 120)
    private String descriptionDivition;

    private int country;

    @Column(length = 120)
    private String descripcionCountry;

    @Column(length = 120)
    private String hobbies;

    @Temporal(TemporalType.TIMESTAMP)
    private Date retirementDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date registerDate;

    @PrePersist
    public void prepersist() {
        this.registerDate = new Date();
    }

    public Client(){

    }    

    public Long getSerial() {
        return serial;
    }

    public void setSerial(Long serial) {
        this.serial = serial;
    }

    public Long getIdentificationNumber() {
        return identificationNumber;
    }

    public void setIdentificationNumber(Long identificationNumber) {
        this.identificationNumber = identificationNumber;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getTelephoneAditional() {
        return telephoneAditional;
    }

    public void setTelephoneAditional(String telephoneAditional) {
        this.telephoneAditional = telephoneAditional;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getDescriptionPosition() {
        return descriptionPosition;
    }

    public void setDescriptionPosition(String descriptionPosition) {
        this.descriptionPosition = descriptionPosition;
    }

    public int getCity() {
        return city;
    }

    public void setCity(int city) {
        this.city = city;
    }

    public String getDescriptionCity() {
        return descriptionCity;
    }

    public void setDescriptionCity(String descriptionCity) {
        this.descriptionCity = descriptionCity;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getCommunity() {
        return community;
    }

    public void setCommunity(int community) {
        this.community = community;
    }

    public String getDescripcionCommunity() {
        return descripcionCommunity;
    }

    public void setDescripcionCommunity(String descripcionCommunity) {
        this.descripcionCommunity = descripcionCommunity;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getDivition() {
        return divition;
    }

    public void setDivition(int divition) {
        this.divition = divition;
    }

    public String getDescriptionDivition() {
        return descriptionDivition;
    }

    public void setDescriptionDivition(String descriptionDivition) {
        this.descriptionDivition = descriptionDivition;
    }

    public int getCountry() {
        return country;
    }

    public void setCountry(int country) {
        this.country = country;
    }

    public String getDescripcionCountry() {
        return descripcionCountry;
    }

    public void setDescripcionCountry(String descripcionCountry) {
        this.descripcionCountry = descripcionCountry;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public Date getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(Date retirementDate) {
        this.retirementDate = retirementDate;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Client(Long serial, Long identificationNumber, String names, String lastName, String direction, String email, String telephone,
            String telephoneAditional, String phone, int position, String descriptionPosition, int city,
            String descriptionCity, Date birthDay, String gender, int community, String descripcionCommunity,
            String companyName, int divition, String descriptionDivition, int country, String descripcionCountry,
            String hobbies, Date retirementDate, Date registerDate) {
        this.serial = serial;
        this.identificationNumber = identificationNumber;
        this.names = names;
        this.lastName = lastName;
        this.direction = direction;
        this.email = email;
        this.telephone = telephone;
        this.telephoneAditional = telephoneAditional;
        this.phone = phone;
        this.position = position;
        this.descriptionPosition = descriptionPosition;
        this.city = city;
        this.descriptionCity = descriptionCity;
        this.birthDay = birthDay;
        this.gender = gender;
        this.community = community;
        this.descripcionCommunity = descripcionCommunity;
        this.companyName = companyName;
        this.divition = divition;
        this.descriptionDivition = descriptionDivition;
        this.country = country;
        this.descripcionCountry = descripcionCountry;
        this.hobbies = hobbies;
        this.retirementDate = retirementDate;
        this.registerDate = registerDate;
    }

    

}