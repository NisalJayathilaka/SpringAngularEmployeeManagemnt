package com.nisal.employeemanager.controller;

import com.nisal.employeemanager.dto.CreateEmployeeDTO;
import com.nisal.employeemanager.entity.EmployeeEntity;
import com.nisal.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employee")
@CrossOrigin
public class EmployeeController {

    private EmployeeService employeeService;
    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    @PostMapping()
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.saveEmployee(employeeEntity);
    }

    @GetMapping()
    public List<EmployeeEntity> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @DeleteMapping("/{employeeId}")
    public String deleteEmployeeById(@PathVariable int employeeId){
        return employeeService.deleteEmployeeById(employeeId);
    }

    @GetMapping("/{employeeId}")
    public ResponseEntity<EmployeeEntity> getEmployeeById(@PathVariable int employeeId){
        return employeeService.getEmployeeById(employeeId);
    }

}
