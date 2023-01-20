package com.company.professions;


import com.company.vehicles.Cars;

public class Person {
    private int age;
    private String fullName;

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return   getFullName()+ " "+getAge();
    }
}