package com.omrbranch.service;

import org.springframework.stereotype.Service;

import com.omrbranch.entity.EmployeeEntity;

@Service
public interface EmployeeService {
	EmployeeEntity getEmployeeDetails(EmployeeEntity employeeEntity);

}
