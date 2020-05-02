package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExelIntro {
	public static void main(String[] args) throws IOException {
		String a = System.getProperty("user.dir");
		System.out.println(a);

		String filePath = a + "\\configs\\Test1.xlsx";
		String filePath1 = "C:\\Users\\19292\\OneDrive\\Documents\\Test1.xlsx";

		FileInputStream fis = new FileInputStream(filePath);
		Workbook wbook = new XSSFWorkbook(fis);
		Sheet sheet = wbook.getSheet("Sheet1");
		double cellv=sheet.getRow(1).getCell(4).getNumericCellValue();
		System.out.println(cellv);
		System.out.println((int)cellv);
		String cellv1=sheet.getRow(1).getCell(4).toString();
		System.out.println(cellv1);
		String[] arr=cellv1.split("\\.");
		System.out.println(arr[0]);

		for (int i = 0; i < 3; i++) {
			Row row1 = sheet.getRow(i);
			for(int j=0; j<5; j++) {
			Cell cell = row1.getCell(j);
			String r1c2 = cell.toString();
			System.out.print(r1c2 + "   ");
			}
			System.out.println();
		}
	}

}
