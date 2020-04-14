package com.syntax.class26_2;

public class Employee {
private String name;
private int age;
private double salary;

public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public double getSalary() {
	return salary;
}
public void setName(String name) {
	if(!name.isEmpty()&&name.length()>3) {
	this.name=name;}
	//else {System.out.println("Name must have three or more characters");
}
public void setAge(int age) {
	this.age=age;
}
public void setSalary(double salary) {
	this.salary=salary;
}





}
