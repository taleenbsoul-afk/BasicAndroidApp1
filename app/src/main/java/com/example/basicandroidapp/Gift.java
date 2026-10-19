package com.example.basicandroidapp;

import java.io.Serializable;

public class Gift implements Serializable {
    private String gender;
    private String ageRange;
    private String intrest;
    private String budget;
    private String logo;

    public Gift(String gender, String ageRange, String intrest, String budget, String logo) {
        this.gender = gender;
        this.ageRange = ageRange;
        this.intrest = intrest;
        this.budget = budget;
        this.logo = logo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAgeRange() {
        return ageRange;
    }

    public void setAgeRange(String ageRange) {
        this.ageRange = ageRange;
    }

    public String getIntrest() {
        return intrest;
    }

    public void setIntrest(String intrest) {
        this.intrest = intrest;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "gender='" + gender + '\'' +
                ", ageRange='" + ageRange + '\'' +
                ", intrest='" + intrest + '\'' +
                ", budget='" + budget + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
