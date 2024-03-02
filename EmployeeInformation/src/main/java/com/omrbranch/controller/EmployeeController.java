package com.omrbranch.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.omrbranch.entity.EmployeeEntity;
import com.omrbranch.modelpacakage.CreateEmployee;
import com.omrbranch.serviceimpl.EmployeeImpl;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeImpl impl;
	
	@PostMapping(value = "/CreateEmployee")
	public EmployeeEntity createEmployeeName(@RequestBody EmployeeEntity employeeEntity ) {
		EmployeeEntity employeeDetails = impl.getEmployeeDetails(employeeEntity);
		return employeeDetails;

	}
	@PostMapping(value = "/GetDetailsofall")
	public EmployeeEntity getAllEmpCollDetails(@RequestBody CreateEmployee createEmployee) {
		EmployeeEntity createEmployee2 = impl.createEmployee(createEmployee);
		return createEmployee2;
		
		
	}
	

}
