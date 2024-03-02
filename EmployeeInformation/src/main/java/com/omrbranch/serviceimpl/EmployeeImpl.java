package com.omrbranch.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.omrbranch.entity.EmployeeEntity;
import com.omrbranch.modelpacakage.CollegeInformationEntity;
import com.omrbranch.modelpacakage.CreateEmployee;
import com.omrbranch.repo.EmployeeRepo;
import com.omrbranch.resttemplate.DepartmentServiceRestTemplate;
import com.omrbranch.service.EmployeeService;

@Component
public class EmployeeImpl implements EmployeeService {
	@Autowired
	EmployeeRepo repo;

	@Autowired
	DepartmentServiceRestTemplate rest;

	@Override
	public EmployeeEntity getEmployeeDetails(EmployeeEntity employeeEntity) {
		EmployeeEntity save = repo.save(employeeEntity);
		return save;
	}

	public EmployeeEntity createEmployee(CreateEmployee createEmployee) {
		// Request Inputs
		int departmentId = createEmployee.getDepartmentId();
		String employeeName = createEmployee.getEmployeeName();

		// 8081 call and getting response
		CollegeInformationEntity getdepartmentById = rest.getdepartmentById(departmentId);

		// Creating new
		EmployeeEntity employeeEntity = new EmployeeEntity(0, employeeName, getdepartmentById.getDepartmentName(),
				getdepartmentById.getCollegeName());
		return repo.save(employeeEntity);

	}
}
