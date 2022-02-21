package com.example.springboot.repostory;

import com.example.springboot.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepostory extends CrudRepository<Employee,Long> {

}
