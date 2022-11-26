package selenium;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HowToReadExcelFile20 {

	
		
		//public class ReadExcel {

			public static void main(String[] args) throws IOException   {

				// Open/Enter the workbook				
				XSSFWorkbook wb = new XSSFWorkbook("./data11/ReadData.xlsx");			
				
				//Get Sheet			
				XSSFSheet sheet = wb.getSheet("Sheet1");
				
				//1.Get row count
					
						/*int rowCount = sheet.getLastRowNum();
						System.out.println(rowCount);

				//2.Get column count
						int columnCount = sheet.getRow(0).getLastCellNum();
						System.out.println(columnCount);*/
				
				//Get row
				XSSFRow row = sheet.getRow(4);
							
				//Get column
				  XSSFCell cell = row.getCell(1);
				
				//Action- Read/print particular CellValue
				 String cellValue = cell.getStringCellValue();
				System.out.println(cellValue);
	}

}
