package selenium.excel.read;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import selenium.excel.utility.ExcelDemo;


public class ExcelRead {

	WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void setUp(String browser) throws MalformedURLException{
		DesiredCapabilities cap=null;
		if(browser.equals("firefox")){
			cap=DesiredCapabilities.firefox();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}else if(browser.equals("chrome")){
			cap=DesiredCapabilities.chrome();
			cap.setBrowserName("chrome");
			cap.setPlatform(Platform.WINDOWS);
		}
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		driver.get("http://www.snapdeal.com/");
	}
  @Test
  public void f() {
	  ExcelDemo demo=new ExcelDemo();
	  Sheet shet=demo.excelRead("G:\\seleniumsw\\Book1.xlsx","Sheet1");
	  System.out.println("Sheet"+shet);
	  Iterator<Row> irow=shet.iterator();
	  while(irow.hasNext()){
		  Row row=irow.next();
		  Iterator<Cell> icell=row.cellIterator();
		  while(icell.hasNext()){
			  Cell cell=icell.next();
			  System.out.print(cell.getStringCellValue() );
		  }
		  System.out.println();
	  }
  }
}
