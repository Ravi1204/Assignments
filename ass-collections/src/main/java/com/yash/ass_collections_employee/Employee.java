package com.yash.ass_collections_employee;

import java.util.Objects;

public class Employee
{
int id;
String name;
double salary;
String designation;
String department;


public Employee(int id, String name, double salary, String designation, String department) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.designation = designation;
	this.department = department;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
			+ ", department=" + department + "]";
}
@Override
public int hashCode() {
	return Objects.hash(department, designation, id, name, salary);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!(obj instanceof Employee))
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(department, other.department) && Objects.equals(designation, other.designation)
			&& id == other.id && Objects.equals(name, other.name)
			&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
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
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}


}
