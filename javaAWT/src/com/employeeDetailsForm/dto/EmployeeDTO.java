package com.employeeDetailsForm.dto;

public class EmployeeDTO {		// DTO - Data Transfer Object

	private int employeeID;
	
	private String employeeName;
	
	private Double MobileNumber;
	
	private String gender;
	
	private Boolean pf;
	
	private Boolean graduity;
	
	private Boolean mealCard;
	
	private Boolean nps;
	
	private Boolean mediclaim;
	
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
	
	public Double getEmployeeMobile() {
		return MobileNumber;
	}
	
	public void setEmployeeMobile(Double mobile) {
		this.MobileNumber = mobile;
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

	public Boolean getmediclaim() {
		return mediclaim;
	}

	public void setmediclaim(Boolean mediclaim) {
		this.mediclaim = mediclaim;
	}

	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeDTO [employeeID=");
		builder.append(employeeID);
		builder.append(", employeeName=");
		builder.append(employeeName);
		builder.append(", employeeMobile=");
		builder.append(MobileNumber);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", perks=");
		builder.append(pf);
		builder.append(", graduity=");
		builder.append(graduity);
		builder.append(", mealCard=");
		builder.append(mealCard);
		builder.append(", nps=");
		builder.append(nps);
		builder.append(", mediclaim=");
		builder.append(mediclaim);
		builder.append(", officeLocation=");
		builder.append(officeLocation);
		builder.append("]");
		return builder.toString();
	}
	
//	@Override
//	public String toString() {
//		return "EmployeeDTO [employeeID=" + employeeID + ", employeeName=" + employeeName + ", employeeMobile=" + employeeMobile +
//				", gender=" + gender + ", pf=" + pf + ", graduity=" + graduity + ", mealCard=" + mealCard + ", nps=" + nps + 
//				", mediclaim="+ mediclaim + ", officeLocation=" + officeLocation + "]";
//	}

}
