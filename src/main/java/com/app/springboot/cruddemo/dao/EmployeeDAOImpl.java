package com.app.springboot.cruddemo.dao;

import com.app.springboot.cruddemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    private final EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> theQuery = entityManager.createQuery("FROM Employee", Employee.class);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public Employee findEmployee(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        return employee;
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = entityManager.merge(employee);
        return dbEmployee;
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class,id);
        entityManager.remove(employee);
    }
}
