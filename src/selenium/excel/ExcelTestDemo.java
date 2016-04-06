package selenium.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelTestDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fi=new FileInputStream("G:\\kkc\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row row=ws.getRow(0);
		Cell cell=row.getCell(0);
		cell.setCellValue("sandeep");
		
		FileOutputStream fo=new FileOutputStream("G:\\kkc\\Book1.xlsx");
		wb.write(fo);
		
		fo.close();
		
	}

}
