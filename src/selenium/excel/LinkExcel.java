package selenium.excel;


import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LinkExcel {
public static void main(String[] args) throws Exception{
	FileInputStream f=new FileInputStream("G:\\kkc\\links.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("Sheet1");
	
	Row r=null;
	Cell c=null;
	r=ws.createRow(0);
	c=r.createCell(0);
	c.setCellValue("abc");
	
	FileOutputStream f1=new FileOutputStream("G:\\kkc\\links.xlsx");
	wb.write(f1);
	f1.close();
}
}
