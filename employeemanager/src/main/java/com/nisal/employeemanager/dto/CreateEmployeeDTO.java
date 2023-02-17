package com.nisal.employeemanager.dto;

import javax.persistence.Column;

public class CreateEmployeeDTO {

    private String employeeName;
    private String employeeEmail;
    private String employeeJobTitle;
    private String employeePhone;
    private String employeeImageUrl;
    private String employeeCode;

    public CreateEmployeeDTO() {
    }

    public CreateEmployeeDTO(String employeeName, String employeeEmail, String employeeJobTitle, String employeePhone, String employeeImageUrl, String employeeCode) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeJobTitle = employeeJobTitle;
        this.employeePhone = employeePhone;
        this.employeeImageUrl = employeeImageUrl;
        this.employeeCode = employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public String getEmployeeJobTitle() {
        return employeeJobTitle;
    }

    public void setEmployeeJobTitle(String employeeJobTitle) {
        this.employeeJobTitle = employeeJobTitle;
    }

    public String getEmployeePhone() {
        return employeePhone;
    }

    public void setEmployeePhone(String employeePhone) {
        this.employeePhone = employeePhone;
    }

    public String getEmployeeImageUrl() {
        return employeeImageUrl;
    }

    public void setEmployeeImageUrl(String employeeImageUrl) {
        this.employeeImageUrl = employeeImageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }
}
