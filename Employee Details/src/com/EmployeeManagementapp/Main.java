package com.EmployeeManagementapp;

import java.util.Scanner;

public class Main {
	static EmployeeService empService= new EmployeeService();
	static boolean order=true;
	public static void menu()
	{
		System.out.println("*********Welcome to Employee Managemnt System"
				+ "\n1. Add Employee "
				+ "\n2. View Employee "
				+ "\n3. Update Employee "
				+ "\n4. Delete Employee "
				+ "\n5. View All Employees"
				+ "\n6. Exit \n ");
	}

	public static void main(String[] args) {
		Scanner takeInput = new Scanner(System.in);
		
		do {
			Main.menu();
			int choice=takeInput.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Add Employee ");
				empService.addEmp();
				break;
			case 2:
				System.out.println("View Employee ");
				empService.viewEmp();
				break;
			case 3:
				System.out.println("Update Employee ");
				empService.updateEmployee();
				break;
			case 4:
				System.out.println("Delete Employee ");
				empService.deleteEmployee();
				break;
			case 5:
				System.out.println("View All Employees ");
				empService.ViewAllEmployees();
				break;
			case 6:
				System.out.println("Exit");
				System.exit(0);

			default:
				System.out.println("please enter valid choice");
				break;
			}
		} while (order);
		
		
		
	}

}
