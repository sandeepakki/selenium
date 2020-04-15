package ReadExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class TestData {
	@Test
	public void testTestData() throws EncryptedDocumentException, IOException, InterruptedException {
		//open workbook in read mode using FileInputStream class
		FileInputStream fis=new FileInputStream("C:\\Test Data\\workbook1.xlsx");
		//workbook will open in read mode and control of workbook will be stored in fis.
	Workbook w1=WorkbookFactory.create(fis);
	//for create method pass control of workbook in read mode
	//w1 contains workbook control
	//to get sheet control we should use get sheet pass sheet name as  string arg
	Sheet s1 = w1.getSheet("Sheet1");
	//to get row control we should use getRow(int), pass row num as int arg
	Row r1=s1.getRow(4);
	//to get cell control we should use getCell(int); pass cellNumber as int arg
	Cell c1=r1.getCell(0);
	//to read data from Cell we should use getStringCellValue(). return type is String
	String s=c1.getStringCellValue();
	System.out.println("Data from Excel is: "+s);
	int RC=s1.getLastRowNum();
	System.out.println("total rows is:"+RC);
	
	Thread.sleep(1000);
	for(int i=0;i<RC;i++)
	{
		String sr=s1.getRow(i).getCell(0).getStringCellValue();
		System.out.println("Data from row is:"+sr);
	}
	w1.close();
	}

}
