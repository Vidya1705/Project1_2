package Utiliser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT 
{
    public String excelsheet(String sheetname,int rowno, int cellno ) throws EncryptedDocumentException, IOException
    {
    	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
    	Workbook w1=WorkbookFactory.create(f1);
    	String value=	w1.getSheet(sheetname).getRow(rowno).getCell(cellno).getStringCellValue();
        return value;
    }
    public String excelsheetph_no(String sheetname,int rowno, int cellno ) throws EncryptedDocumentException, IOException
    {
    	FileInputStream f1= new FileInputStream("C:\\Users\\User\\eclipse-workspace\\SeleniumBasics\\Vidya.xlsx");
    	Workbook w1=WorkbookFactory.create(f1);
    	String a=	NumberToTextConverter.toText(w1.getSheet(sheetname).getRow(rowno).getCell(cellno).getNumericCellValue());
        return a;
    }
}
