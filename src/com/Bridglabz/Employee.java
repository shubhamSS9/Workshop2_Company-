package com.Bridglabz;

public class Employee {
    private String name;
    private int age;
    private String email;
    private String city;
    private String phoneNumber;
    private String department;

    public void employeeDetail(String name, int age, String email, String city, String phoneNumber, String department){
        this.name=name;
        this.age=age;
        this.city=city;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.department=department;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCity() {
        return city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getDepartment() {
        return department;
    }
}
