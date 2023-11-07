package com.github.employeesrest.service;

import com.github.employeesrest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee create(Employee employee);

    Employee update(Employee employee);

    Employee findById(int id);

    List<Employee> findAll();

    String delete(int id);
}
