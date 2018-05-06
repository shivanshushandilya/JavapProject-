package JavaArrayHandling;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class icrementalWorkingDays {

	public String incrementDaysExcludingWeekends(String[] args) throws ParseException {
        // format of date is passed as an argument
		SimpleDateFormat sdf = new SimpleDateFormat(args[1]);
        // base date which will be incremented
        String dateStr = args[0];
        Date date = sdf.parse(dateStr);
        Calendar c = Calendar.getInstance();
        // set calendar time with given date
        c.setTime(date);
        // number of days to increment
        int maxIncrement = Integer.parseInt(args[2]);
        // add days to date 
        c.add(Calendar.DAY_OF_WEEK, maxIncrement);
        // check if the date after addition is a working day. 
        // If not then keep on incrementing it till it is a working day
        while(!isWorkingDay(c.getTime(), c)) {
            c.add(Calendar.DAY_OF_WEEK, 1);
        }
          return sdf.format(c.getTime());
    }

    private boolean isWorkingDay(Date date, Calendar calendar) {
        // set calendar time with given date
        calendar.setTime(date);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        // check if it is Saturday(day=7) or Sunday(day=1)
        if ((dayOfWeek == 7) || (dayOfWeek == 1)) {
            return false;
        }
        return true;
     }
	}


