package com.ultramain.um21.apache;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ExcelOperation {
   public static void main(String [] args) throws IOException
   {
	   String file="E:\\UM-21 Internship Training\\JavaWorkSpace\\ApachiPOI\\Apachi\\emp_details.xlsx";
	   
	   FileInputStream fileinput=new FileInputStream(file);
	   
	   XSSFWorkbook workbook=new XSSFWorkbook(fileinput);
	   
	   XSSFSheet sheet=workbook.getSheet("Sheet1");
	   
  
      int row=sheet.getLastRowNum();
      int col=sheet.getRow(1).getLastCellNum();
      
      for(int r=0;r<row;r++)
      {
    	  XSSFRow rows=sheet.getRow(r);
      for(int c=0;c<col;c++)
      {
    	    XSSFCell cols=rows.getCell(c);
        
    	    switch(cols.getCellType())
    	    {
    	    case STRING:System.out.print("   "  +cols.getStringCellValue());
    	            break;
    	    case NUMERIC:System.out.print("   "  +cols.getNumericCellValue());
    	            break;
    	    case BOOLEAN:System.out.print("   "  +cols.getBooleanCellValue());
    	            break;
    	    
    	    }
         }
       System.out.println();
}
}
}