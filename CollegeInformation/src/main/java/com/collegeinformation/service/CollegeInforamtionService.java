package com.collegeinformation.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.collegeinformation.entity.CollegeInformationEntity;

@Service
public interface CollegeInforamtionService {
	CollegeInformationEntity getCollegeInfo(CollegeInformationEntity collegeInformationEntity);
	List<CollegeInformationEntity> getAllCollegeInformation(CollegeInformationEntity collegeInformationEntity);
	List<CollegeInformationEntity> getCollegeInfoByDepartmentName(String DepartmentName);
	List<CollegeInformationEntity> getCollegeInfoByCollegeName(String collegeName);

}
