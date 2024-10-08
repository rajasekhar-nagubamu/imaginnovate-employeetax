package com.imaginnovate.employeetax.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imaginnovate.employeetax.entity.Employee;
import com.imaginnovate.employeetax.service.EmployeeService;

import jakarta.validation.Valid;



	@RequestMapping("/api/employees")
	@RestController
	@Validated
	public class EmployeeController {

	    @Autowired
	    private EmployeeService empService;

	    @PostMapping("/save")
	    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
	    ResponseEntity createEmployee(@Valid @RequestBody Employee emp){
	        return new ResponseEntity(empService.saveEmployee(emp), HttpStatus.CREATED);
	    }

	    @GetMapping("/{employeeId}/tax-deductions")
	    ResponseEntity calculateEmployeeTax(@PathVariable Integer id){
	        return new ResponseEntity(empService.calculateTotalTax(id),HttpStatus.OK);
	    }
}
