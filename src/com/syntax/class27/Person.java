package com.syntax.class27;

public class Person {
	private String firstName, lastName, ssn;
	private int birthMonth, birthDay, birthYear;
	Person(String firstName, String lastName, String ssn,
			int birthMonth, int birthDay, int birthYear){
		this.birthDay=birthDay; this.birthMonth=birthMonth;
		this.birthYear=birthYear; this.firstName=firstName;
		this.lastName=lastName; this.ssn=ssn;}
	
	
	public void setFirstN(String firstName) {
		this.firstName=firstName;}
	
	public void setLastN(String lastName) {
		this.lastName=lastName;}
	
	public void setSSN(String ssn) {
		this.ssn=ssn;}
	
	public void setMonth(int birthMonth) {
		this.birthMonth=birthMonth;}
	
	public void setDay(int birthDay) {
		this.birthDay=birthDay;}
	
	public void setYear(int birthYear) {
		this.birthYear=birthYear;}
	
	
	public String getFirstN() {
		return firstName;}
	
	public String getLastN() {
		return lastName;}
	
	public String getSSN() {
		return ssn;}
	
	public int getMonth() {
		return birthMonth;}
	
	public int getDay() {
		return birthDay;}
	
	public int getYear() {
		return birthYear;}
	
	public String formatBirthday() {
		return birthMonth+"/"+birthDay+"/"+birthYear;
	}
}
