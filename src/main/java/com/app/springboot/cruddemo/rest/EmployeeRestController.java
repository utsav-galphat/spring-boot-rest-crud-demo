package com.app.springboot.cruddemo.rest;

import com.app.springboot.cruddemo.entity.Employee;
import com.app.springboot.cruddemo.exception.EmployeeNotFoundException;
import com.app.springboot.cruddemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    /* expose employee */
    private EmployeeService employeeService;

    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployee() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable int employeeId) {
        Employee employee = employeeService.findEmployee(employeeId);
        if (employeeId >= employeeService.findAll().size() || employeeId < 0 || employee == null) {
            throw new EmployeeNotFoundException("Employee Id not found: " + employeeId);
        }
        return employeeService.findEmployee(employeeId);
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employee.setId(0);
        return employeeService.save(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        Employee dbEmployee = employeeService.save(employee);
        return dbEmployee;
    }

    @DeleteMapping("/employees/{employeeId}")
    public String deleteEmployee(@PathVariable int employeeId){
        Employee employee = employeeService.findEmployee(employeeId);
        if (employeeId >= employeeService.findAll().size() || employeeId < 0 || employee == null) {
            throw new EmployeeNotFoundException("Employee Id not found: " + employeeId);
        }
        employeeService.deleteById(employeeId);
        return "Employee deleted :" + employeeId;
    }
}
