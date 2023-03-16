package com.Bridglabz;

public class Company {
    public void employeeDetail(){
     Employee employee=new Employee();
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("City: " + employee.getCity());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("PhoneNumber: " + employee.getPhoneNumber());
        System.out.println("Department: " + employee.getDepartment());
    }
}
