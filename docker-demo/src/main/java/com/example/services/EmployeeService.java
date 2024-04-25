package com.example.services;

import com.example.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public Employee getEmployee(int id);
    public List<Employee> getAllEmployee();
    public void deleteEmployee(int id);
}
