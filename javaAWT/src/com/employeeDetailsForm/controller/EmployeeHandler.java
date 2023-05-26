package com.employeeDetailsForm.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.employeeDetailsForm.Serviceimpl.EmployeeServiceImpl;
import com.employeeDetailsForm.view.EmpFrameDesign;
import com.employeeDetailsForm.dto.EmployeeDTO;
import com.employeeDetailsForm.Service.EmployeeService;

public class EmployeeHandler implements ActionListener {

	EmpFrameDesign ef;
	EmployeeService employeeService;

	public EmployeeHandler(EmpFrameDesign employeeFrame) {
		ef = employeeFrame;
		employeeService = (EmployeeService) new EmployeeServiceImpl();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String action = e.getActionCommand().toLowerCase();
		EmployeeDTO dto = getEmployeeData(ef);
		switch (action) {
		case "save":
			employeeService.saveEmployee(dto);
			break;
		case "update":
			System.out.println("update Clicked");
			break;
		case "search":
			EmployeeDTO searchResult = employeeService.searchEmployee(dto);
			System.out.println("This is queried from DB" + searchResult);
			// refresh your UI
			break;

		case "delete":
			System.out.println("Delete Clicked");
			break;

		}
	}

	public EmployeeDTO getEmployeeData(EmpFrameDesign ef2) {
		EmployeeDTO empDTO = new EmployeeDTO();
		empDTO.setEmployeeID(Integer.parseInt(ef2.getEmployeeIdTxt().getText()));
		empDTO.setEmployeeName(ef2.getEmployeeNameTxt().getText());
		empDTO.setGender(ef2.getGenderGroup().getSelectedCheckbox().getLabel());
		empDTO.setPf(ef2.getPfOption().getState());
		empDTO.setGraduity(ef2.getGradutiyOption().getState());
		empDTO.setMealCard(ef2.getMealCardOption().getState());
		empDTO.setOfficeLocation(ef2.getOfficeLocation().getSelectedItem());

		System.out.println(empDTO);
		return empDTO;
	}

}