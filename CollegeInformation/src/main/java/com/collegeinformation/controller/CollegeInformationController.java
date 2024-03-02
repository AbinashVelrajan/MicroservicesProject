package com.collegeinformation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collegeinformation.entity.CollegeInformationEntity;
import com.collegeinformation.serviceimpl.CollegeInformationServiceImpl;

@RestController
public class CollegeInformationController {
	@Autowired
	CollegeInformationServiceImpl impl;

	@PostMapping(value = "/CreateCollegeInfo")
	public CollegeInformationEntity createCollegeInfo(@RequestBody CollegeInformationEntity collegeInformationEntity) {
		CollegeInformationEntity collegeInfo = impl.getCollegeInfo(collegeInformationEntity);
		return collegeInfo;

	}

	@GetMapping(value = "/GetAllCollegeInfo")
	public List<CollegeInformationEntity> getAllCollegeInfo(CollegeInformationEntity collegeInformationEntity) {
		List<CollegeInformationEntity> allCollegeInformation = impl.getAllCollegeInformation(collegeInformationEntity);
		return allCollegeInformation;

	}

	@GetMapping(value = "/GetDeptName/{deptName}")
	public List<CollegeInformationEntity> getCollegeInfoByDeptName(@PathVariable String deptName) {
		List<CollegeInformationEntity> collegeInfoByDepartmentName = impl.getCollegeInfoByDepartmentName(deptName);
		return collegeInfoByDepartmentName;
	}

	@GetMapping(value = "/getcollegeName/{collegeName}")

	public List<CollegeInformationEntity> getCollegeInfoByCollegeName(@PathVariable String collegeName) {
		List<CollegeInformationEntity> collegeInfoByCollegeName = impl.getCollegeInfoByCollegeName(collegeName);
		return collegeInfoByCollegeName;

	}

	@GetMapping(value = "/getCollegeById/{id}")
	public CollegeInformationEntity getCollegeById(@PathVariable int id) {
		CollegeInformationEntity collegeInfoByDepartmentId = impl.getCollegeInfoByDepartmentId(id);
		return collegeInfoByDepartmentId;
	}

}
