package com.timesheet.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.timesheet.EmployeeDao;
import com.timesheet.model.Employee;


public class EmployeeDaoImpl implements EmployeeDao {

	@Override
	public boolean insertEmployee(Employee employee) {
		Connection con = connectDatabase();
		int rows=0;
		boolean flag = false;
		try {
			PreparedStatement ps = con.prepareStatement("insert into employee (empid, empname, hcc, emailid, doj) values(?,?,?,?,?)");
			ps.setInt(1, employee.getEmpid());
			ps.setString(2, employee.getEmpName());
			ps.setString(3, employee.getHcc());
			ps.setString(4,  employee.getEmailId());
			ps.setDate(5, (java.sql.Date)employee.getDate());
			rows = ps.executeUpdate();
			if (rows > 0) flag = true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public Connection connectDatabase() {
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","Y@shAim#190");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}

	@Override
	public List<Employee> getAllEmployee() {
		Connection con = connectDatabase();
		List<Employee> list= new ArrayList<Employee>();
		
		try {
			PreparedStatement ps = con.prepareStatement("select * from employee");
			ResultSet rs= ps.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setEmpid(rs.getInt("empid"));
				emp.setEmpName(rs.getString("empName"));
				emp.setHcc(rs.getString("hcc"));
				emp.setEmailId(rs.getString("emailId"));
				emp.setDate(rs.getDate("date"));
				
				list.add(emp);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
