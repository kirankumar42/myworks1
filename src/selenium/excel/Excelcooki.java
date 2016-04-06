package selenium.excel;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Excelcooki {
	FirefoxDriver driver;
	@BeforeTest
	public void setUp(){
		driver=new FirefoxDriver();
		
	}
	@Test
	public void test() throws Exception{
		FileInputStream fi=new FileInputStream("G:\\kkc\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet ws=wb.getSheet("Sheet1");
		Row r=null;
		Cell c=null;
		Set<org.openqa.selenium.Cookie> mycookie=driver.manage().getCookies();
		System.out.println(mycookie.size());
		int size1=mycookie.size();
		Iterator<org.openqa.selenium.Cookie> it=mycookie.iterator();
		while(it.hasNext()){
			org.openqa.selenium.Cookie co=it.next();
			for(int i=0;i<size1;i++){
			r=ws.createRow(i);
			c=r.createCell(i);
			c.setCellValue(co.getName());
			}
		}
	}
}
