package selenium.excel;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelTest {


	public static void main(String[] args) throws Exception {
		FileInputStream f=new FileInputStream("G:\\kkc\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		String[] names={"kkc","chakravarthi","kc","challavaripalli","ytiu"};
		//create new row and new cell
		
		Row row=ws.createRow(0);
			for(int j=0;j<5;j++){
				Cell cell=row.createCell(j);
				cell.setCellValue(names[j]);
			}
		
		

		FileOutputStream fo=new FileOutputStream("G:\\kkc\\Book1.xlsx");
		wb.write(fo);
		fo.close();
		

	}

}
