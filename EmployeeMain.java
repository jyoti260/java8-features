package com.mycompany.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
                Employee[] empArr = {
        		new Employee("john",3456.78),
        		new Employee("joohn",4456.78),
        		new Employee("ram",3456.88),
        		new Employee("rina",8456.78),
        		new Employee("rohan",7456.78),
        		
        };
		List<Employee>empList = Arrays.asList(empArr);
		
		empList.parallelStream().filter((emp)-> {
			return emp.getSalary() > 4000.00;
		}).collect(Collectors.toList());
		
		
		for(Employee e: empList) {
		System.out.println("Emp name :"+e.getEmpName()+",Emp salary:"+e.getSalary());
			
			
			//remove Employee whose  name starts with  Ro
			//empList.removeIf(e->e.getEmpName().startsWith("Ro"));
		}
	}

}
