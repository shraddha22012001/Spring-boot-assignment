package com.example.springboot.service;

import com.example.springboot.model.Employee;
import com.example.springboot.repostory.EmployeeRepostory;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class EmployeeServiceImpl  implements EmployeeService {
    @Autowired
    EmployeeRepostory repostory;
    @Override
    public List<Employee> getAllEmployee() {
        return (List<Employee>) repostory.findAll();
    }

    @Override
    public Employee getById(Long id) {
        return repostory.findById(id).get();
    }

    @Override
    public void saveOrUpdate(Employee employee) {
      repostory.save(employee);
    }


}
