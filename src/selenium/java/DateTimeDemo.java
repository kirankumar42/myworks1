package selenium.java;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeDemo {

public static void main(String[] args) {
		
		Date dates=new Date();
		System.out.println("This is date:"+dates);
		int i=1;
		while(i<=40){
			Date newdate=addDays(dates,i);
			System.out.println("New Date:"+newdate);
			i+=1;
		}
		
		int j=1;
		while(j<=30){
			Date sudate=subDays(dates,i);
			System.out.println("SubTra:"+sudate);
			j+=1;
		}
		
	}
		public static Date addDays(Date date, int days){
			GregorianCalendar ger=new GregorianCalendar();
			ger.setTime(date);
			ger.add(Calendar.DATE, days);
			return ger.getTime();
		}
		
		public static Date subDays(Date date, int days){
			GregorianCalendar ger=new GregorianCalendar();
			ger.setTime(date);
			ger.add(Calendar.DATE, -days);
			return ger.getTime();
			
		}
		
}
