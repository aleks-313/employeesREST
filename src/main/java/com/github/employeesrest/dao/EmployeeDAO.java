package com.github.employeesrest.dao;

import com.github.employeesrest.entity.Employee;
import java.util.List;

public interface EmployeeDAO {

    Employee save(Employee employee);

    Employee findById(int id);

    List<Employee> findAll();

    String delete(int id);

}
