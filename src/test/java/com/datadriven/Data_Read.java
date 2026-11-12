package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Data_Read {

	public static void main(String[] args) throws IOException  {

		File f = new File("C:\\Users\\balas\\eclipse-workspace\\AdaCucumber8AM\\Excel\\DataReadAug.xlsx");

	    FileInputStream fis = new FileInputStream(f);
	    
	    Workbook wb = new XSSFWorkbook(fis);
	    
	    Sheet sheetAt = wb.getSheetAt(0);
	    
	     Row row = sheetAt.getRow(0);
	     
	     Cell cell = row.getCell(1);
	     
	      CellType cellTp = cell.getCellType();
	     
	       if(cellTp.equals(CellType.STRING)) {
				String stringCellValue = cell.getStringCellValue();
				System.out.println(stringCellValue);
	       }
	       else if(cellTp.equals(CellType.NUMERIC)) {
	    	   double numericCellValue = cell.getNumericCellValue();
	    	   
	    	   int value = (int)numericCellValue;
	    	   System.out.println(value);
	    	   
	       }
	     
	     
	    
	    
	    
	    
	    
	    
	
	
	    
	    
	}

}
