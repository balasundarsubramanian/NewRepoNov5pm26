package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Write {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\balas\\OneDrive\\Documents\\Project8Write.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("project").createRow(0).createCell(0).setCellValue("Language");
       
		wb.getSheet("project").getRow(0).createCell(1).setCellValue("Tools");
		
		FileOutputStream fo = new FileOutputStream(f);
		
		wb.write(fo);
		
		wb.close();
		
		System.out.println("Successfully written");
		
		
		
		
	
	
	}

}
