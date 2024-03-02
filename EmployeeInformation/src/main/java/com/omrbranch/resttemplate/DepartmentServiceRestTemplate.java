package com.omrbranch.resttemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

//import com.omrbranch.entity.Model;
import com.omrbranch.modelpacakage.CollegeInformationEntity;

@Configuration
public class DepartmentServiceRestTemplate {

	@Autowired
	RestTemplate restTemplate;

	public CollegeInformationEntity getdepartmentById(int departmentId) {
		ResponseEntity<CollegeInformationEntity> exchange = restTemplate.exchange(
				"http://localhost:8081/getCollegeById/"+departmentId, HttpMethod.GET, null, CollegeInformationEntity.class);
		CollegeInformationEntity body = exchange.getBody();
		return body;
	}
}
