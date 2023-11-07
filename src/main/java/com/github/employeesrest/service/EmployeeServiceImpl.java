package com.github.employeesrest.service;

import com.github.employeesrest.dao.EmployeeDAO;
import com.github.employeesrest.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Transactional
    @Override
    public Employee create(Employee employee) {
        employee.setId(0);
        return employeeDAO.save(employee);
    }

    @Transactional
    @Override
    public Employee update(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Transactional
    @Override
    public String delete(int id) {
        return employeeDAO.delete(id);
    }
}
