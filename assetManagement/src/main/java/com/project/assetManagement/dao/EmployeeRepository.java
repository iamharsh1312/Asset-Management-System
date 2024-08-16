package com.project.assetManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.assetManagement.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
    // You can add custom query methods if needed
}