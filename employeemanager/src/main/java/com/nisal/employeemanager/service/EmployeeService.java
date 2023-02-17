package com.nisal.employeemanager.service;

import com.nisal.employeemanager.dto.CreateEmployeeDTO;
import com.nisal.employeemanager.entity.EmployeeEntity;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
}
