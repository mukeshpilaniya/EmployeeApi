package com.pilaniya.employeeapi.Repository;

import com.pilaniya.employeeapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface employeeRepository extends JpaRepository<Employee,Long> {
}