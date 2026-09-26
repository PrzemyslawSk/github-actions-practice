package com.przemyslawsk.github_actions_practice.repository;

import com.przemyslawsk.github_actions_practice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
