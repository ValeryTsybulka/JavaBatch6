package com.syntax.class29;

import java.util.*;

public class Students {
public static void main(String[] args) {
	HashSet<Student> st=new HashSet<>();
	st.add(new Student("John", 11));
	st.add(new Student("Jane", 22));
	st.add(new Student("July", 33));
	st.add(new Student("Jack", 44));
	
	for(Student student:st) {
	System.out.println(student.getName()+" has ID "+student.getId());
	System.out.println("********************************");
	}
	
}
}
