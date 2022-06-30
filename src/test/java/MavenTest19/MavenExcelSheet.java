package MavenTest19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class MavenExcelSheet 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		String path = ("C:\\Users\\ADMIN\\Desktop\\TestCaseTemplate.xls");
		FileInputStream Excel= new FileInputStream(path);
		Workbook w= WorkbookFactory.create(Excel);
		Sheet sh=w.getSheet("Test Case 1");
		String str= sh.getRow(0).getCell(0).getStringCellValue();
	System.out.println(str);
		
	}

}
