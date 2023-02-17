package com.nisal.employeemanager.service;

import com.nisal.employeemanager.dto.CreateEmployeeDTO;
import com.nisal.employeemanager.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    List<EmployeeEntity> getAllEmployee();

    String deleteEmployeeById(int id);
}
