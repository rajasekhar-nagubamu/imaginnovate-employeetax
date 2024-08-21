package com.imaginnovate.employeetax.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeTaxDetails {
	    private Integer employeeCode;
	    private String firstName;
	    private String lastName;
	    private Integer annualSalary;
	    private Integer tax;
	    private Integer cessTax;
}
