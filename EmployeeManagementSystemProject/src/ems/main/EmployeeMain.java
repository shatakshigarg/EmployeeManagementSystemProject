package ems.main;

import java.util.List;

import ems.dto.Employee;
import ems.exceptions.EmployeeNotFoundException;
import ems.service.EmployeeServiceImpl;
import ems.service.IEmployeeService;

public class EmployeeMain {
	public static void main(String[] args) {
		IEmployeeService eservice = new EmployeeServiceImpl();
		eservice.addEmployee(new Employee(1111,"A","MANAGER", 28));
		eservice.addEmployee(new Employee(2222,"B","CEO", 25));
		eservice.addEmployee(new Employee(3333,"C","EMPLOYEE", 30));
		eservice.addEmployee(new Employee(4444,"D","CLERK", 30));
		
		
		System.out.println(" ");
		List<Employee> elist = eservice.showAllEmployees();
		for(Employee e:elist) {
			System.out.println(e.getEmpid()+":"+e.getEmpname()+":"+e.getDesignation()+":"+e.getDaysAttended());
		}
		
		System.out.println(" ");
		eservice.deleteEmployee(1111);
		eservice.updateEmployee(new Employee(2222,"UPDATED-E","MD", 28));
		try {
			Employee temp = eservice.findEmployee(new Employee(2222,"UPDATED-E","MD", 28));
			System.out.println(temp.getEmpid()+" "+temp.getEmpname());
		} catch (EmployeeNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
