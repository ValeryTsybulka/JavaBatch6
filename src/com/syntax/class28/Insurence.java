package com.syntax.class28;

public abstract  class Insurence {
String insurenceName;

public Insurence(String insurenceName) {
	this.insurenceName=insurenceName;
}
abstract void getQuote();
abstract void cancelInsurence();
}
