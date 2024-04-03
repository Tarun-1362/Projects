package com.EmployeeManagementapp;

import java.util.HashSet;
import java.util.Scanner;

public class EmployeeService {
	
	HashSet<Employee> employeeset= new HashSet<Employee>();
	 Employee emp1= new Employee(1001,23,"Tarun Kumar",300000,"Devops Engineer");
	 Employee emp2= new Employee(1002,23,"Ravi Kumar",38000,"Jr Engineer");
	 Employee emp3= new Employee(1003,23,"Naresh Kumar",45000,"Software Engineer");
	 Employee emp4= new Employee(1004,23,"Raghu Kumar",85000,"cloud Engineer");
	 Employee emp5= new Employee(1005,23,"Austin Kumar",70000,"Devops Engineer");
	 Employee emp6= new Employee(1006,23,"Paul Reddy",69000,"SR. Manager");
	
	 
	 Scanner sc = new Scanner(System.in);
	 boolean found=false;
	 int id;
	 int age;
	 String name;
	 double salary;
	 String designation;
	 
	 
	 public EmployeeService() {
		employeeset.add(emp1);
		employeeset.add(emp2);
		employeeset.add(emp3);
		employeeset.add(emp4);
		employeeset.add(emp5);
		employeeset.add(emp6);
		
	}
	 //view all employees
	 public void ViewAllEmployees()
	 {
		 for (Employee employee : employeeset) {
			 System.out.println(employee);
		}
		 
	 }
	 
	 //view single employee
	 public void viewEmp()
	 {
		 System.out.println("Enter Id:");
		 id=sc.nextInt();
		 for(Employee emp: employeeset) 
		 {
			 if(emp.getId()==id)
			 {
				 System.out.println(emp);
				 found=true;
			 }
		 }
		 if(!found)
		 {
			 System.out.println("Employee with the given ID is not present \n");
		 }
	 }
	 
	 //update employee
	 public void updateEmployee()
	 {
		 
		 System.out.println("Enter Id for the employee you want to update: ");
		 id=sc.nextInt();
		 for(Employee emp: employeeset) 
		 {
			 if(emp.getId()==id) 
			 {
				 found=true;
				 System.out.println("*********Welcome to Employee Management System"+ "\n\nPlease select the options specified."
							+ "\n1. Update Name "
							+ "\n2. Update age "
							+ "\n3. Update Salary "
							+ "\n4. Update Designation ");
				 int choice = sc.nextInt();
				switch (choice) 
				{
				case 1:
					System.out.println("please enter the updated name for the employee.");
					name=sc.next();
					emp.setName(name);
					break;
				case 2:
					System.out.println("please enter the updated age for the employee.");
					age=sc.nextInt();
					emp.setAge(age);
					break;
				case 3:
					System.out.println("please enter the updated Salary for the employee.");
					salary=sc.nextDouble();
					emp.setSalary(salary);
					break;
				case 4:
					System.out.println("please enter the updated Designation for the employee.");
					designation=sc.next();
					emp.setName(designation);
					break;

				default:
					System.out.println("Please select only the specified options!!");
					break;
				}
				 
			 }
	 }
		 if(!found)
		 {
			 System.out.println("Employee with the given ID is not present");
		 }
	 }
	 
	 //Delete Employee
	 public void deleteEmployee() {
		 System.out.println("Enter ID of employee you want to delete:\n");
		 id=sc.nextInt();
		 boolean found = false;
		 Employee empdelete = null;
		 for (Employee emp : employeeset) {
			 if(emp.getId()==id)
			 {
				 empdelete=emp;
				 found=true;
			 }
		}
		 if(!found) {
			 System.out.println("Please enter a valid ID\n");
		 }
		 else {
			 employeeset.remove(empdelete);
			 System.out.println("Employee Deleted.\n");
		 }
		 
		 
		 
		 
	 }
	 // add employee
	 public void addEmp() {
		 System.out.println("Enter ID:");
		 id=sc.nextInt();
		 System.out.println("Enter Name:");
		 name=sc.next();
		 System.out.println("Enter Age:");
		 age=sc.nextInt();
		 System.out.println("Enter Designation:");
		 designation=sc.next();
		 System.out.println("Enter Salary:");
		 salary=sc.nextDouble();
		 
		 Employee emp=new Employee(id,age, name, salary, designation);
		 
		 employeeset.add(emp);
		 System.out.println("Employee Added\n");
		 
	 }
	 
}
	 
	 
	 
	 
	 


