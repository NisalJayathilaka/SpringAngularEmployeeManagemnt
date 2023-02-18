package com.nisal.employeemanager.repo;

import com.nisal.employeemanager.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer> {
    List<EmployeeEntity> findByEmployeeName(String employeeName);
}
