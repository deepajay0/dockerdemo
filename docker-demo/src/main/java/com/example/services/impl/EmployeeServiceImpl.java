package com.example.services.impl;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepo;
import com.example.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;
    @Override
    public Employee addEmployee(Employee employee) {
        Employee savedEmployee = employeeRepo.save(employee);
        return savedEmployee;
    }

    @Override
    public Employee getEmployee(int id) {

        return employeeRepo.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee = employeeRepo.findById(id).orElse(null);
        if(employee != null){
            employeeRepo.delete(employee);
        }


    }
}
