package com.employeeDetailsForm.Serviceimpl;

import com.employeeDetailsForm.Service.EmployeeService;
import com.employeeDetailsForm.dto.EmployeeDTO;
import com.mysql.jdbc.Driver;
import java.sql.*;

public class EmployeeServiceImpl implements EmployeeService {

	Connection con;

	@Override
	public void saveEmployee(EmployeeDTO employeeDTO) {
		try {
			DriverManager.registerDriver(new Driver());
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?characterEncoding=utf8", "root", "root123");
			
             System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
                     + con.getMetaData().getDatabaseProductName());
            
			PreparedStatement ps = con.prepareStatement("INSERT INTO javadb.employeedata\n"
					+ "(employee_id, employee_name, gender, pf, graduity, meal_card, office_location)\n"
					+ "VALUES(?, ?, ?, ?, ?, ?, ?);");
			ps.setInt(1, employeeDTO.getEmployeeID());
			ps.setString(2, employeeDTO.getEmployeeName());
			ps.setString(3, employeeDTO.getGender());
			ps.setBoolean(4,employeeDTO.getPf());
			ps.setBoolean(5, employeeDTO.getGraduity());
			ps.setBoolean(6, employeeDTO.getMealCard());
			ps.setString(7, employeeDTO.getOfficeLocation());
			ps.execute();
			
			/*
			Statement stmt = (Statement) con.createStatement();
			String query = "INSERT INTO new_schema.employeedetails\n"
					+ "(EmployeeId, EmployeeName, MobileNumber, Gender, Perks, Location, Address, Salary)\n" + "VALUES('"
					+ employeeDTO.getEmployeeName() +  "', '" +employeeDTO.getEmployeeMobile()+ "', '" + employeeDTO.getGender() + "'," + employeeDTO.getPf()
					+ "," + employeeDTO.getGraduity() + "," + employeeDTO.getMealCard() + "," + "'"
					+ employeeDTO.getOfficeLocation() + "')";
			stmt.execute(query);
			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	@Override
	public void updateEmployee(EmployeeDTO employeeDTO) {
		try {
		DriverManager.registerDriver(new Driver());
		con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?characterEncoding=utf8", "root", "root123");
		PreparedStatement ps = con.prepareStatement("UPDATE javadb.employeedata"
				+ "SET employee_Id=? employee_name=?, gender=?, pf=?, graduity=?, meal_card=?, office_location=?"
				+ "WHERE employee_id=?");
		
		ps.setInt(1, employeeDTO.getEmployeeID());
		ps.setString(2, employeeDTO.getEmployeeName());
		ps.setString(3, employeeDTO.getGender());
		ps.setBoolean(4,employeeDTO.getPf());
		ps.setBoolean(5, employeeDTO.getGraduity());
		ps.setBoolean(6, employeeDTO.getMealCard());
		ps.setString(7, employeeDTO.getOfficeLocation());
		ps.execute();
		}
		 catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
	}
	@Override
	public EmployeeDTO searchEmployee(EmployeeDTO employeeDTO) {
		EmployeeDTO dto = new EmployeeDTO();
		try {
		DriverManager.registerDriver(new Driver());
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javadb?characterEncoding=utf8", "root", "root123");
		PreparedStatement ps = con.prepareStatement("SELECT employee_id, employee_name, gender, pf, graduity, meal_card, office_location, \n"
				+ "where employee_id =?");
		ps.setInt(1, employeeDTO.getEmployeeID());
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			dto.setEmployeeName(rs.getString(2));
			dto.setGender(rs.getNString(3));
			dto.setPf(rs.getBoolean(4));
			dto.setGraduity(rs.getBoolean(5));
			dto.setMealCard(rs.getBoolean(6));
			dto.setOfficeLocation(rs.getString(7));
		}
			return dto;
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
					con.close();
					System.out.println(con.isClosed());
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return dto;
		}
	}
}