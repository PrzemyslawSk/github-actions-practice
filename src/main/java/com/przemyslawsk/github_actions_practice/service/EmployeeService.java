package com.przemyslawsk.github_actions_practice.service;

import com.przemyslawsk.github_actions_practice.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> getAllEmployees();
}
