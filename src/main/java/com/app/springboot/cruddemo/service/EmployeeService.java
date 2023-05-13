package com.app.springboot.cruddemo.service;

import com.app.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findEmployee(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
