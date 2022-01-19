package com.timesheet;

import java.sql.Connection;
import java.util.List;

import com.timesheet.model.Employee;

public interface EmployeeDao {
	public boolean insertEmployee(Employee employee);
	public  Connection connectDatabase();
	public List<Employee> getAllEmployee();
}
