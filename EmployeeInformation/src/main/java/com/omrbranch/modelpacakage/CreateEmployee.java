package com.omrbranch.modelpacakage;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployee {
	private int departmentId;
	private String employeeName;

}
