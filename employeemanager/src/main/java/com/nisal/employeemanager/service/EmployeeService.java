package com.nisal.employeemanager.service;

import com.nisal.employeemanager.dto.UpdateEmployeeDTO;
import com.nisal.employeemanager.entity.EmployeeEntity;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface EmployeeService {
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);

    List<EmployeeEntity> getAllEmployee();

    String deleteEmployeeById(int employeeId);

    ResponseEntity<EmployeeEntity> getEmployeeById(int employeeId);


    String updateEmployee(int employeeId, UpdateEmployeeDTO updateEmployeeDTO);
}
