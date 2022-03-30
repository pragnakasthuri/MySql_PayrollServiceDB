package com.bridgelabz;

import java.time.LocalDate;

public class EmployeePayrollData {
    private int id;
    private String name;
    private String gender;
    private long phoneNumber;
    private String address;
    private String department;
    private LocalDate startDate;

    /**
     * Creating a parameterised constructor with all the parameters
     * @param id
     * @param name
     * @param gender
     * @param phoneNumber
     * @param address
     * @param department
     * @param startDate
     */
    public EmployeePayrollData(int id, String name, String  gender, long phoneNumber, String address,
                               String department, LocalDate startDate) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.department = department;
        this.startDate = startDate;
    }

    /**
     * Creating getter and setter methods for all the variables
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String  getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
}