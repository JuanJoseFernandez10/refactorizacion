package com.endes;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {
	    List<Employee> employeesList = new ArrayList<Employee>();
	    int numberOfEmployees = 0;
	    
	    /**
	     * Add of employee
	     * @param employee
	     */
	    public void addEmployee(Employee employee) {
	        if (numberOfEmployees < 10) {
	            employeesList.add(employee);
	            numberOfEmployees++;
	            System.out.println(employee + " added to the system.");
	        } else {
	            System.out.println("Cannot add more employees, system is full.");
	        }
	    }
	    
	    /**
	     * Print the List of the employees
	     */
	    public void printEmployees() {
	        System.out.println("List of employees:");
	        for (int i = 0; i < employeesList.size(); i++) {
	            System.out.println(employeesList.get(i));
	        }
	    }
	}
	
