package JavaArrayHandling;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class CalendrConcept {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		
		
		LocalDate sixDaysAfter = now.plusDays(1);
		System.out.println(sixDaysAfter);
		
		LocalDate friday1 = sixDaysAfter.with( TemporalAdjusters.nextOrSame( DayOfWeek.FRIDAY ) ).plusDays(2);
		
		LocalDate sixDaysBehind = now.minusDays(5);
		
		LocalDate friday = sixDaysBehind.with( TemporalAdjusters.nextOrSame( DayOfWeek.FRIDAY ) ).minusDays( 1 ) ;
		//LocalDate sunday = friday.minusDays( 1 ) ; 
		
		DateTimeFormatter formatter_2 = DateTimeFormatter.ofPattern("dd/MM/yyyy 11:20");
		
		
		String format1=(friday1).format(formatter_2 );
		  System.out.println(format1);
		  
		  

	}

}
