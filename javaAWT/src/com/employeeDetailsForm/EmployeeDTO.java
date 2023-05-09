package com.employeeDetailsForm;

public class EmployeeDTO {
private int employeeID;
	
	private String employeeName;
	
	private String employeeMobile;
	
	private String gender;
	
	private Boolean pf;
	
	private Boolean graduity;
	
	private Boolean mealCard;
	
	private Boolean nps;
	
	private Boolean medilcaim;
	
	private String officeLocation;

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public String getEmployeeMobile() {
		return employeeMobile;
	}
	
	public void setEmployeeMobile(String employeeMobile) {
		this.employeeMobile = employeeMobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getPf() {
		return pf;
	}

	public void setPf(Boolean pf) {
		this.pf = pf;
	}

	public Boolean getGraduity() {
		return graduity;
	}

	public void setGraduity(Boolean graduity) {
		this.graduity = graduity;
	}

	public Boolean getMealCard() {
		return mealCard;
	}

	public void setMealCard(Boolean mealCard) {
		this.mealCard = mealCard;
	}

	public Boolean getNps() {
		return nps;
	}

	public void setNps(Boolean nps) {
		this.nps = nps;
	}

	public Boolean getMedilcaim() {
		return medilcaim;
	}

	public void setMedilcaim(Boolean medilcaim) {
		this.medilcaim = medilcaim;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeMobile=" + employeeMobile +
				", gender=" + gender + ", pf=" + pf + ", graduity=" + graduity + ", mealCard=" + mealCard + ", nps=" + nps + 
				", medilcaim="+ medilcaim + ", officeLocation=" + officeLocation + "]";
	}

}
