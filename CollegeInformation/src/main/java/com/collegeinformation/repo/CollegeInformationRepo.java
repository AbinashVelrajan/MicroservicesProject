package com.collegeinformation.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.collegeinformation.entity.CollegeInformationEntity;
import java.util.List;


@Repository
public interface CollegeInformationRepo extends JpaRepository<CollegeInformationEntity, Integer> {

	List<CollegeInformationEntity> findByDepartmentName(String departmentName);

	List<CollegeInformationEntity> findByCollegeName(String collegeName);
}
