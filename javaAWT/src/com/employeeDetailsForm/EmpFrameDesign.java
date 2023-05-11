package com.employeeDetailsForm;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.ScrollPane;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import com.employeeDetailsForm.EmpFrameDesign;

public class EmpFrameDesign extends Frame{

	private Label employeeIdLbl;
	private TextField employeeIdTxt;
	private Label employeeNameLbl;
	private TextField employeeNameTxt;
	private Label employeeMobileLbl;
	private TextField employeeMobileTxt;
	private Label employeeGenderLbl;
	private Checkbox maleOption;
	private Checkbox femaleOption;
	private Checkbox otherOption;
	private Label employeePerkLbl;
	private Checkbox pfOption;
	private Checkbox gradutiyOption;
	private Checkbox mealCardOption;
	private Checkbox npsOption;
	private Checkbox mediclaimOption; 
	private CheckboxGroup genderGroup;
	private Label locationLbl;
	private Choice officeLocation;
	private Label employeeAddressLbl;
	private TextArea employeeAddressTxtArea;
	private Label employeeSalaryLbl;
	private TextField employeeSalaryTxt;
	
	private Button saveButton ;
	private Button searchButton;
	private Button updateButton;
	
	private Button firstButton;
	private Button nextButton;
	private Button previousButton;
	private Button lastButton;
	
	public EmpFrameDesign() {
		setBounds(50, 50, 700, 600);
		setTitle("Employee Information");
		setVisible(true);
		setLayout(null);
		
		genderGroup = new CheckboxGroup();
		
		employeeIdLbl = new Label("Employee Id");
		employeeIdLbl.setBounds(20,50,100,20);
		add(employeeIdLbl);
		
		employeeIdTxt = new TextField();
		employeeIdTxt.setBounds(140,50,100,20);
		add(employeeIdTxt);
		
		employeeNameLbl = new Label("Employee Name");
		employeeNameLbl.setBounds(20,90,100,20);
		add(employeeNameLbl);

		employeeNameTxt = new TextField();
		employeeNameTxt.setBounds(140,90,100,20);
		add(employeeNameTxt);
		
		employeeMobileLbl = new Label("Employee Mobile Number");
		employeeMobileLbl.setBounds(20,130,150,20);
		add(employeeMobileLbl);
		
		employeeMobileTxt = new TextField();
		employeeMobileTxt.setBounds(200,130,120,20);
		add(employeeMobileTxt);
		
		employeeGenderLbl = new Label("Employee Gender");
		employeeGenderLbl.setBounds(20,170,130,20);
		add(employeeGenderLbl);
		
		//checkbox radio button
		maleOption = new Checkbox("Male",false,genderGroup);
		maleOption.setBounds(160,170,80,20);
		add(maleOption);
		
		femaleOption = new Checkbox("Female",false,genderGroup);
		femaleOption.setBounds(260,170,80,20);
		add(femaleOption);
		
		otherOption = new Checkbox("Other",false,genderGroup);
		otherOption.setBounds(360,170,80,20);
		add(otherOption);
		
		employeePerkLbl = new Label("Employee Perks");
		employeePerkLbl.setBounds(20,220,100,20);
		add(employeePerkLbl);
		
		// checkbox -- multi select
		pfOption = new Checkbox("PF");
		pfOption.setBounds(140,220,40,20);
		add(pfOption);
		
		gradutiyOption = new Checkbox("Graduity");
		gradutiyOption.setBounds(220,220,100,20);
		add(gradutiyOption);
		
		mealCardOption = new Checkbox("Meal Card");
		mealCardOption.setBounds(340,220,100,20);
		add(mealCardOption);
		
		npsOption = new Checkbox("NPS");
		npsOption.setBounds(470, 220, 80, 20);;
		add(npsOption);

		mediclaimOption = new Checkbox("Mediclaim");
		mediclaimOption.setBounds(560, 220, 120, 20);;
		add(mediclaimOption);
		
		
		locationLbl = new Label("Location");
		locationLbl.setBounds(20,270,100,20);
		add(locationLbl);
		
		// Choice -- for Dropdown list
		officeLocation = new Choice();
		officeLocation.setBounds(140,270,120,20);
		
		officeLocation.add("Select Location");
		officeLocation.add(" Pune");
		officeLocation.add(" Hyderabad");
		officeLocation.add(" Banglore");
		officeLocation.add(" Hubali");
		officeLocation.add(" Chennai");
		
		add(officeLocation);
		
		// address
		employeeAddressLbl = new Label("Employee Address ");
		employeeAddressLbl.setBounds(280, 270, 120, 20);
		add(employeeAddressLbl);
		
		//TextArea textArea = new TextArea("text", 3 , 100 , TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		employeeAddressTxtArea = new TextArea("",3,150, employeeAddressTxtArea.SCROLLBARS_NONE);
		employeeAddressTxtArea.setBounds(410, 270, 180, 100);
		add(employeeAddressTxtArea);
		
		// Salary
		
		employeeSalaryLbl = new Label("Employee Salary");
		employeeSalaryLbl.setBounds(20,370,100,20);
		add(employeeSalaryLbl);
		
		employeeSalaryTxt = new TextField();
		employeeSalaryTxt.setBounds(150,370,100,20);
 		add(employeeSalaryTxt);
		
		// Action Buttons 
		saveButton = new Button("SAVE");
		saveButton.setBounds(80,480,100,30);
		saveButton.setBackground(Color.lightGray);
		saveButton.isBackgroundSet();
		add(saveButton);
		saveButton.addActionListener(new EmpOperations(this));
		
		searchButton = new Button("SEARCH");
		searchButton.setBounds(200, 480, 100, 30);
		searchButton.setBackground(Color.lightGray);
		searchButton.isBackgroundSet();
		add(searchButton);
		searchButton.addActionListener(new EmpOperations(this));
		
		updateButton = new Button("UPDATE");
		updateButton.setBounds(320, 480, 100, 30);
		updateButton.setBackground(Color.lightGray);
		updateButton.isBackgroundSet();
		add(updateButton);
		updateButton.addActionListener(new EmpOperations(this));
		
		/* firstButton  nextButton	previousButton	lastButton */
		
		firstButton = new Button("FIRST");
		firstButton.setBackground(Color.lightGray);
		firstButton.isBackgroundSet();
		firstButton.setBounds(20, 520, 100, 30);
		add(firstButton);
		firstButton.addActionListener(new EmpOperations(this));
		
		nextButton = new Button("NEXT");
		nextButton.setBounds(140, 520, 100, 30);
		nextButton.setBackground(Color.lightGray);
		nextButton.isBackgroundSet();
		add(nextButton);
		nextButton.addActionListener(new EmpOperations(this));
		
		previousButton = new Button("PREVIOUS");
		previousButton.setBounds(260, 520, 100, 30);
		previousButton.setBackground(Color.lightGray);
		previousButton.isBackgroundSet();
		add(previousButton);
		previousButton.addActionListener(new EmpOperations(this));
		
		lastButton = new Button("LAST");
		lastButton.setBounds(380, 520, 100, 30);
		lastButton.setBackground(Color.lightGray);
		lastButton.isBackgroundSet();
		add(lastButton);
		lastButton.addActionListener(new EmpOperations(this));
		
		// Close frame
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				
				EmpFrameDesign ef = (EmpFrameDesign)e.getSource();
				ef.dispose();
			}
		});
	}

	public Label getEmployeeIdLbl() {
		return employeeIdLbl;
	}

	public void setEmployeeIdLbl(Label employeeIdLbl) {
		this.employeeIdLbl = employeeIdLbl;
	}

	public TextField getEmployeeIdTxt() {
		return employeeIdTxt;
	}

	public void setEmployeeIdTxt(TextField employeeIdTxt) {
		this.employeeIdTxt = employeeIdTxt;
	}

	public Label getEmployeeNameLbl() {
		return employeeNameLbl;
	}

	public void setEmployeeNameLbl(Label employeeNameLbl) {
		this.employeeNameLbl = employeeNameLbl;
	}

	public TextField getEmployeeNameTxt() {
		return employeeNameTxt;
	}

	public TextField getEmployeeMobileTxt() {
		return employeeMobileTxt;
	}

	public void setEmployeeMobileTxt(TextField employeeMobileTxt) {
		this.employeeMobileTxt = employeeMobileTxt;
	}

	public void setEmployeeNameTxt(TextField employeeNameTxt) {
		this.employeeNameTxt = employeeNameTxt;
	}

	public Checkbox getMaleOption() {
		return maleOption;
	}

	public void setMaleOption(Checkbox maleOption) {
		this.maleOption = maleOption;
	}

	public Checkbox getFemaleOption() {
		return femaleOption;
	}

	public void setFemaleOption(Checkbox femaleOption) {
		this.femaleOption = femaleOption;
	}

	public Checkbox getOtherOption() {
		return otherOption;
	}

	public void setOtherOption(Checkbox otherOption) {
		this.otherOption = otherOption;
	}

	public Label getEmployeeGenderLbl() {
		return employeeGenderLbl;
	}

	public void setEmployeeGenderLbl(Label employeeGenderLbl) {
		this.employeeGenderLbl = employeeGenderLbl;
	}

	public Label getEmployeePerkLbl() {
		return employeePerkLbl;
	}

	public void setEmployeePerkLbl(Label employeePerkLbl) {
		this.employeePerkLbl = employeePerkLbl;
	}

	public Checkbox getPfOption() {
		return pfOption;
	}

	public void setPfOption(Checkbox pfOption) {
		this.pfOption = pfOption;
	}

	public Checkbox getGradutiyOption() {
		return gradutiyOption;
	}

	public void setGradutiyOption(Checkbox gradutiyOption) {
		this.gradutiyOption = gradutiyOption;
	}

	public Checkbox getMealCardOption() {
		return mealCardOption;
	}

	public void setMealCardOption(Checkbox mealCardOption) {
		this.mealCardOption = mealCardOption;
	}

	public Checkbox getNpsOption() {
		return npsOption;
	}

	public void setNpsOption(Checkbox npsOption) {
		this.npsOption = npsOption;
	}

	public Checkbox getMediclaimOption() {
		return mediclaimOption;
	}

	public void setMediclaimOption(Checkbox mediclaimOption) {
		this.mediclaimOption = mediclaimOption;
	}

	public CheckboxGroup getGenderGroup() {
		return genderGroup;
	}

	public void setGenderGroup(CheckboxGroup genderGroup) {
		this.genderGroup = genderGroup;
	}

	public Label getLocationLbl() {
		return locationLbl;
	}

	public void setLocationLbl(Label locationLbl) {
		this.locationLbl = locationLbl;
	}

	public Button getSaveButton() {
		return saveButton;
	}

	public void setSaveButton(Button saveButton) {
		this.saveButton = saveButton;
	}

	public Button getSearchButton() {
		return searchButton;
	}

	public void setSearchButton(Button searchButton) {
		this.searchButton = searchButton;
	}

	public Button getUpdateButton() {
		return updateButton;
	}

	public void setUpdateButton(Button updateButton) {
		this.updateButton = updateButton;
	}

	public Choice getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(Choice officeLocation) {
		this.officeLocation = officeLocation;
	}
	
}