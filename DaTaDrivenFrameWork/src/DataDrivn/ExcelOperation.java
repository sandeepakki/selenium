package DataDrivn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelOperation {


	public static String readData(String SheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Test Data\\workbook1.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
		String s=w1.getSheet(SheetName).getRow(rowNumber).getCell(cellNumber).getStringCellValue();
		return s;
	}
	public static long readData1(String SheetName,int rowNumber,int cellNumber) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Test Data\\workbook1.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
		long l=(long)w1.getSheet(SheetName).getRow(rowNumber).getCell(cellNumber).getNumericCellValue();
		return l;
	}
	public static void writeData(String SheetName,int rowNumber,int cellNumber,String cellData) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Test Data\\workbook1.xlsx");
	Workbook w1 = WorkbookFactory.create(fis);
		w1.getSheet(SheetName).getRow(rowNumber).createCell(cellNumber).setCellValue(cellData);
		FileOutputStream fos=new FileOutputStream("C:\\Test Data\\workbook1.xlsx");
		w1.write(fos);
		
	}
	
}
