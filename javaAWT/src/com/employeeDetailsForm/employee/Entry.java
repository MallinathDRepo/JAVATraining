package com.employeeDetailsForm.employee;

import java.util.ArrayList;
import java.util.List;

import com.employeeDetailsForm.view.EmpFrameDesign;
import com.employeeDetailsForm.dto.EmployeeDTO;

public class Entry {
	public static List<EmployeeDTO> employeeList = new ArrayList<EmployeeDTO>();
	public static void main(String[] args) {
		new EmpFrameDesign();
	}
}