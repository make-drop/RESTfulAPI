package com.api.restful.demo.payroll.repository;

import com.api.restful.demo.payroll.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
