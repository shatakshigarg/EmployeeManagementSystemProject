package ems.dao;

import java.util.List;

import ems.dto.Employee;
import ems.exceptions.EmployeeNotFoundException;

public interface IEmployeeDAO {
	public abstract void addEmployee(Employee e);
	public abstract void deleteEmployee(int empid);
	public abstract void updateEmployee(Employee e);
	public abstract  Employee findEmployee(Employee e) throws EmployeeNotFoundException;
	public List<Employee>showAllEmployees();
	
	public static final String URL = "jdbc:mysql://localhost:3306/mysql";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "Shatakshi123.";
	public static final String DRIVER_CLASSNAME = "com.mysql.jdbc.Driver";
	
	
	

}
