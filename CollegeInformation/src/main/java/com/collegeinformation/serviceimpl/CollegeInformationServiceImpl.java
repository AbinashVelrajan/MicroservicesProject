package com.collegeinformation.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.collegeinformation.entity.CollegeInformationEntity;
import com.collegeinformation.repo.CollegeInformationRepo;
import com.collegeinformation.service.CollegeInforamtionService;

@Component
public class CollegeInformationServiceImpl implements CollegeInforamtionService {
	@Autowired
	CollegeInformationRepo repo;

	@Override
	public CollegeInformationEntity getCollegeInfo(CollegeInformationEntity collegeInformationEntity) {

		return repo.save(collegeInformationEntity);
	}

	@Override
	public List<CollegeInformationEntity> getAllCollegeInformation(CollegeInformationEntity collegeInformationEntity) {
List<CollegeInformationEntity> findAll = repo.findAll();
		return findAll;
	}

	@Override
	public List<CollegeInformationEntity> getCollegeInfoByDepartmentName(String DepartmentName) {
List<CollegeInformationEntity> findByDepartmentName = repo.findByDepartmentName(DepartmentName);
		return findByDepartmentName;
	}

	@Override
	public List<CollegeInformationEntity> getCollegeInfoByCollegeName(String collegeName) {
		return repo.findByCollegeName(collegeName);
	}
	public CollegeInformationEntity getCollegeInfoByDepartmentId(int departmentId) {
		Optional<CollegeInformationEntity> department = repo.findById(departmentId);
		if (department.isPresent()) {
			return department.get();
			
		}
		return null;
	}

}
