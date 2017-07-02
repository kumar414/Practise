package com.practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo4 {
	public static void main(String [] args) throws IOException
	{
	File src=new File("F:\\Coreseleniumfiles\\test.xlsx");
	FileInputStream srcfin=new FileInputStream(src);
	XSSFWorkbook srcwb= new XSSFWorkbook(srcfin);
	XSSFSheet srcsheet=srcwb.getSheetAt(0); 
	int rowcount=srcsheet.getLastRowNum();
	int colcouunt=srcsheet.getColumnWidth(0);
	System.out.println(colcouunt);
	System.out.println(rowcount); 
	//Object[][] data=new Object[rowcount][colcouunt];
	
	
	
	
	}

}
