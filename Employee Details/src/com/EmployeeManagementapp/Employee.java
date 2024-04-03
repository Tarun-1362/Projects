package com.EmployeeManagementapp;

public class Employee {
	private int id;
	private int age;
	private String name;
	private double salary;
	private String designation;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getId()
	{
		return id;	
	}
	public void setId(int id)
	{
		this.id=id;
	}
	@Override
	public String toString() {
		return String.format(" %nEmployee details:%n\t  id=" + id +  "%n\t  age=" + age + "%n\t  name=" + name +"%n\t  salary=" + salary + ", %n\t  designation="
				+ designation + "%n %n" );
	}
	
	public Employee(int id, int age, String name, double salary, String designation) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}
	
}
