package com.syntax.class29;

import java.util.*;

public class Main1 {
	public static void main(String[] args) {
		Set<Employee> emp = new LinkedHashSet<>();
		emp.add(new Employee("John Doe", 123456789, 80000.0));
		emp.add(new Employee("Jane Smith", 987654321, 90000.0));
		emp.add(new Employee("Jackie Chan", 0, 1000000.0));

		Iterator<Employee> it = emp.iterator();
		while (it.hasNext()) {
			Employee a = it.next();
			System.out.println(a.getName());
			System.out.println(a.getSsn());
			System.out.println(a.getSalary());
		}

	}
}
