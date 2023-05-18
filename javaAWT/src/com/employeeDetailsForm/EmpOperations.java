package com.employeeDetailsForm;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EmpOperations implements ActionListener {

	EmpFrameDesign ef ;
	public EmpOperations(EmpFrameDesign employeeFrame) {
		ef= employeeFrame;
	}

		@Override
		public void actionPerformed(ActionEvent e) {
			String action = e.getActionCommand().toLowerCase();
			EmployeeDTO dto = getEmployeeData(ef);
			switch(action) {
			case "save": 
						saveOrUpdate(dto);
				        break;
			case "update":
						saveOrUpdate(dto);
						break;
			case "search":
						search(dto);
						break;
			case "first":
						first(dto);
						break;
			case "next":
						next(dto);
						break;
			case "previous":
						previous(dto);
						break;
			case "last":
						last(dto);
						break;
			}
		}
		
		private void last(EmployeeDTO dto) { }

		private void previous(EmployeeDTO dto) { }

		private void next(EmployeeDTO dto)  { }

		private void first(EmployeeDTO dto)  { }

		private void search(EmployeeDTO dto)  { }

		public void saveOrUpdate(EmployeeDTO empDto) {
			System.out.println("This is update");
		}
		
		public EmployeeDTO getEmployeeData(EmpFrameDesign ef) {
		
			EmployeeDTO empDTO = new EmployeeDTO();
			empDTO.setEmployeeID(Integer.parseInt(ef.getEmployeeIdTxt().getText()));
			empDTO.setEmployeeName( ef.getEmployeeNameTxt().getText());
			empDTO.setEmployeeMobile(ef.getEmployeeMobileTxt().getText());
			empDTO.setGender(ef.getGenderGroup().getSelectedCheckbox().getLabel());
			empDTO.setPf(ef.getPfOption().getState());
			empDTO.setGraduity(ef.getGradutiyOption().getState());
			empDTO.setMealCard(ef.getMealCardOption().getState());
			empDTO.setOfficeLocation(ef.getOfficeLocation().getSelectedItem());
			
			
//			System.out.println(empDTO);
			return empDTO;
		}
}