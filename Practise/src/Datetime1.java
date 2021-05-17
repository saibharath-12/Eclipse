import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Datetime1 {

	public static void main(String[] args) {
		
		
		LocalDate date = LocalDate.of(2010,Month.JANUARY, 1);
		LocalTime time = LocalTime.of(11,12,52);
		LocalDateTime datetime = LocalDateTime.of(date, time);
		//datetime= datetime.plusHours(10).plusDays(2);
		System.out.println(date);
		System.out.println(time);
		System.out.println(datetime);
		System.out.println("short");
		//System.out.println(datetime.format(DateTimeFormatter.ISO_TIME));
		DateTimeFormatter shorts = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		System.out.println(shorts.format(date));
		System.out.println(shorts.format(datetime));
		//System.out.println(shorts.format(time));
		System.out.println("medium");
		DateTimeFormatter mediums = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
		System.out.println(mediums.format(date));
		System.out.println(mediums.format(datetime));
		System.out.println("long");
		DateTimeFormatter longs = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		System.out.println(longs.format(date));
		System.out.println(longs.format(datetime));
		
		Date date1 = new Date(2012, 11, 4);
		System.out.println(date1.toString());
	}

}
