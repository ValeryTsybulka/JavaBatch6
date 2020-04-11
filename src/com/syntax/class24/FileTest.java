package com.syntax.class24;

public class FileTest {
public static void main(String[] args) {
	File nn=new JavaFile();
	nn.open();
	nn.edit();
	nn.close();
	
	File nn1=new WordFile();
	nn1.open();
	nn1.edit();
	nn1.close();
	
	File nn2=new PDFFile();
	nn2.open();
	nn2.edit();
	nn2.close();
	
}
}
