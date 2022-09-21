package org.digitalsouag.employeemanager.repository;

import org.digitalsouag.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
