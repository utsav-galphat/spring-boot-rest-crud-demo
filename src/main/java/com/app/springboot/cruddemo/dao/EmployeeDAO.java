package com.app.springboot.cruddemo.dao;

import com.app.springboot.cruddemo.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();

    Employee findEmployee(int id);

    Employee save(Employee employee);

    void deleteById(int id);

}
