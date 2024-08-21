package com.imaginnovate.employeetax.service;


import com.imaginnovate.employeetax.dto.EmployeeTaxDetails;
import com.imaginnovate.employeetax.entity.Employee;


public interface EmployeeService {
	public String saveEmployee(Employee emp);
	public EmployeeTaxDetails calculateTotalTax(Integer id);
}
