package com.nisal.employeemanager.service.impl;

import com.nisal.employeemanager.dto.UpdateEmployeeDTO;
import com.nisal.employeemanager.entity.EmployeeEntity;
import com.nisal.employeemanager.repo.EmployeeRepository;
import com.nisal.employeemanager.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceIMPL implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Autowired
    public EmployeeServiceIMPL(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }

    @Override
    public List<EmployeeEntity> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public String deleteEmployeeById(int employeeId) {
        if(employeeRepository.existsById(employeeId)){
            employeeRepository.deleteById(employeeId);
            return "SuccessFully Deleted";
        }else{
            return "There is no Employee";
        }
    }

    @Override
    public ResponseEntity<EmployeeEntity> getEmployeeById(int employeeId) {
       Optional <EmployeeEntity> employeeEntity = employeeRepository.findById(employeeId);

         if(employeeEntity.isPresent()){
             return new ResponseEntity<>(employeeEntity.get(), HttpStatus.OK);
         }else{
             return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
         }
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return employeeRepository.save(employeeEntity);
    }


    @Override
    public List<EmployeeEntity> getEmployeeByName(String employeeName) {
        return employeeRepository.findByEmployeeName(employeeName);


    }


}
