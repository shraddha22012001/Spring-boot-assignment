package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/api")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        service.saveOrUpdate(employee);
        return employee;
    }
   @GetMapping("/details")
    public List<Employee> details(){
        return service.getAllEmployee();
   }   
   @GetMapping("/details/{id}")
   public  Employee getById(@PathVariable Long id){
        return  service.getById(id);
    }
   
   
   
   

}
