package com.syntax.class29;

public class Employee {
	private String fullName;
	private int ssn;
	double salary;

	public Employee(String fullName, int ssn, double salary) {
		this.fullName = fullName;
		this.ssn = ssn;
		this.salary = salary;
	}

	public String getName() {
		return fullName;
	}

	public int getSsn() {
		return ssn;
	}

	public double getSalary() {
		return salary;
	}

}
