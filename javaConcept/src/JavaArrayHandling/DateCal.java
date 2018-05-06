package JavaArrayHandling;






import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE;

import java.time.DayOfWeek;

public class DateCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate now = LocalDate.now();
		LocalDate sixDaysBehind = now.minusDays(10);
		
		LocalDate friday = sixDaysBehind.with( TemporalAdjusters.nextOrSame( DayOfWeek.FRIDAY ) ) ;
		LocalDate sunday = friday.minusDays( 2 ) ; 
		//LocalDate saturday = sixDaysBehind.with( TemporalAdjusters.nextOrSame( DayOfWeek.SATURDAY ) ) ;
		//LocalDate sunday = saturday.plusDays( 1 ) ;  
		
		LocalDate sixDaysAfter = now.plusDays(6);
		
		DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		
		  String format_2=(sixDaysBehind).format(formatter_2);
		  System.out.println(format_2);
		  
		  String format=(sixDaysAfter).format(formatter_2);
		  System.out.println(format);
		  
		  
		  String format1=(sunday).format(formatter_2);
		  System.out.println(format1);
		
		/* LocalDate sixDaysBehind = now.minusDays(6);
		 
		 System.out.println("Today Daste is :"+sixDaysBehind);
		 
		 LocalDate sixDaysAfter = now.plusDays(6);
		 
		 System.out.println("Today Date is :"+sixDaysAfter);
		 
		 */  
		 
		  
		//****************** WeekDay Logic*****************
		  
		  
	 /*
		  
		LocalDate saturday = today.with( TemporalAdjusters.nextOrSame( DayOfWeek.SATURDAY ) ) ;
LocalDate sunday = saturday.plusDays( 1 ) ;  
		  
		  
		  
	*/	  
	  


	}

}
