import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
public class DateTime {

	public static void main(String[] args) {
		/*System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		
		LocalDate localdate = LocalDate.of(1999, Month.MARCH, 22);
		LocalTime localtime = LocalTime.of(10,30);
		System.out.println(localdate);
		System.out.println(localtime);
		System.out.println(LocalDateTime.of(localdate,localtime));*/
		
		
//		System.out.println(new Date());
//		Calendar cal = Calendar.getInstance();
//		cal.set(2015,1);
//		//Calendar calendar = null;
		
	
//		Date January = cal.getTime();
//		System.out.println(January);
		LocalDate start = LocalDate.of(2016,Month.MAY, 12);
		LocalDate end = LocalDate.of(2016,Month.DECEMBER, 12);
		Period p = Period.ofDays(15);
		System.out.println(end.plus(p));
		System.out.println(LocalDate.now().plus(p));
		


		cleananimal(start,end,p);
	}
		
		
		public static void cleananimal(LocalDate start,LocalDate end, Period p) {
			while(start.isBefore(end)) {
				System.out.println("the output is "+start);
				start =start.plus(p);
			}
		
 


		}
	}
		
	


