package selenium.excel.utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDemo {

	  
		private static Workbook book;
		private static Sheet shet;
		private static Row row;
		private static Cell cedata;
		
	  public Sheet excelRead(String fileName,String shetName) {
		 try{
			  FileInputStream fi=new FileInputStream(fileName);
			  if(fileName.endsWith("xlsx")){
				  System.out.println("This is xlsx if");
				  book= new XSSFWorkbook(fi);
			  } else if(fileName.endsWith("xls")){
				  System.out.println("This is xls if");
				  book=new HSSFWorkbook(fi);
			  }
			  shet=book.getSheet(shetName);
				  /*Iterator<Row> rowiter=shet.iterator();
				  while(rowiter.hasNext()){
					Row row = rowiter.next();
					 Iterator<Cell> celliter=row.cellIterator();
					 Book abook=new Book();
					 while(celliter.hasNext()){
						Cell nextcell= celliter.next();
						int column=nextcell.getColumnIndex();
						
					 }
				  }*/
				 // return shet;
		  }catch (Exception e) {
			System.out.println("please specify excel file name");
		}
		return shet;
	  }
	  
	 public static String getData(int rowNo,int colNo){
		 
		try{
			cedata =shet.getRow(rowNo).getCell(colNo);
			String data=cedata.getStringCellValue();
			return data;
		}catch (Exception e) {
			return "";
		}
		 
	 }
	 
	 
	 public void setCellData(String result,int rowNo,int colNo){
		 
		 try{
			 row=shet.getRow(rowNo);
			cedata= row.getCell(colNo, row.RETURN_BLANK_AS_NULL);
			 if(cedata==null){
				 cedata=row.createCell(colNo);
				 cedata.setCellValue(result);
			 }else{
				 cedata.setCellValue(result);
			 }
			 
			 FileOutputStream fo=new FileOutputStream("");
			 book.write(fo);
			 fo.flush();
			 fo.close();
			 
		 }catch (Exception e) {
			System.out.println("Pls specify row and cell information");
		}
	 }
}
