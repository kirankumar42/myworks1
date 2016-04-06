package selenium.excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ExcelPra {
	
	public static void main(String args[]) throws IOException{
		
		FileInputStream f=new FileInputStream("G:\\practise\\Selenium\\Browser\\src\\demo\\excels\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		//Iterator<Row> row=ws.iterator();
		for(Row s: ws){
			for(Cell c: s){
				System.out.print(c.getStringCellValue()+"\t");
			}
			System.out.println();
		}
		/*while(row.hasNext()){
			Row r=row.next();
			Iterator<Cell> c=r.iterator();
			while(c.hasNext()){
				Cell s=c.next();
				System.out.println(s.getStringCellValue());
			}
		}*/
		
	}
}
