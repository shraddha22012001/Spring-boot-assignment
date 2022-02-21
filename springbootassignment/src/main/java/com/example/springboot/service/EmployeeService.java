package com.example.springboot.service;

import com.example.springboot.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getAllEmployee();
    public  Employee getById(Long id);

    public   void saveOrUpdate(Employee employee);


}
