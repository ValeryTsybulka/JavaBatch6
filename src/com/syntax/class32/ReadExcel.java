package com.syntax.class32;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadExcel {
	public static void main(String[] args) throws IOException {

		String filePath="C:\\Users\\19292\\eclipse-workspace\\JavaBasics\\configs\\Test1.xlsx";
		String a=System.getProperty("user.dir");
		System.out.println(a);
		//String filePath="configs\\Test1.xlsx";
		FileInputStream fis=new FileInputStream(filePath);

		//get an Object of Workbook type
		Workbook book=new XSSFWorkbook(fis);
		Sheet sheet=book.getSheet("Sheet1");

		//need to find numbers or rows
		int rows=sheet.getPhysicalNumberOfRows();

		//find number of columns
		int cols=sheet.getRow(0).getLastCellNum();

		//get data from all rows and all columns
		for(int r=0; r<rows;r++) {//iterates over rows
			for(int c=0; c<cols; c++) {//iterates over cols
				String cellVal=sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal+"  ");

		String filePath2 = "C:\\Users\\19292\\OneDrive\\Documents\\Test1.xlsx";
		String filePath1 = System.getProperty("user.dir") + "\\configs\\Test1.xlsx";

		FileInputStream fis1 = new FileInputStream(filePath);

		// get an Object of Workbook type
		Workbook book1 = new XSSFWorkbook(fis);
		Sheet sheet1 = book.getSheet("Sheet1");

		// need to find numbers or rows
		int rows1 = sheet.getPhysicalNumberOfRows();

		// find number of columns
		int cols1 = sheet.getRow(0).getLastCellNum();

		// get data from all rows and all columns
		for (int r1 = 0; r1 < rows; r1++) {// iterates over rows
			for (int c1= 0; c1 < cols; c1++) {// iterates over cols
				String cellVal1 = sheet.getRow(r).getCell(c).toString();
				System.out.print(cellVal1 + "  ");
			}
			System.out.println();
		}

	}
		}}}
