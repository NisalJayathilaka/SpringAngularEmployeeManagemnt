package com.nisal.employeemanager.entity;

import javax.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private int employeeId;
    @Column(name = "employee_name")
    private String employeeName;
    @Column(name = "employee_email")
    private String employeeEmail;
    @Column(name = "employee_jobtitle")
    private String employeeJobTitle;
    @Column(name = "employee_phone")
    private String employeePhone;
    @Column(name = "employee_imageurl")
    private String employeeImageUrl;
    @Column(name = "employee_code")
    private String employeeCode;


    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public EmployeeEntity() {
    }

    public EmployeeEntity(int employeeId, String employeeName, String employeeEmail, String employeeJobTitle, String employeePhone, String employeeImageUrl, String employeeCode) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeJobTitle = employeeJobTitle;
        this.employeePhone = employeePhone;
        this.employeeImageUrl = employeeImageUrl;
        this.employeeCode = employeeCode;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeJobTitle='" + employeeJobTitle + '\'' +
                ", employeePhone='" + employeePhone + '\'' +
                ", employeeImageUrl='" + employeeImageUrl + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                '}';
    }
}
