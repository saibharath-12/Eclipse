import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
public class Dates {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getDay());
		System.out.println(date.getMonth());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(1900+date.getYear());
         
		SimpleDateFormat sdt =new SimpleDateFormat("dd-MM-yyyy HH/mm:ss");
		LocalDate ld = LocalDate.of(2017,Month.APRIL,1);
		System.out.println(sdt.format(date));
		 //LocalDate p = LocalDate.parse("01/08/2020"));
		System.out.println("formatting");
		LocalDateTime now = LocalDateTime.now();  
        System.out.println("Before Formatting: " + now);  
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH/mmss"); 
        LocalDate ld1 = LocalDate.of(2017,Month.APRIL,1);
        String formatDateTime = now.format(format);  
        System.out.println("After Formatting: " + formatDateTime);  
		
        
//        LocalDate k = LocalDate.now();
//        System.out.println(k);
//        SimpleDateFormat sdtt =new SimpleDateFormat("dd-MM-yyyy");
//		System.out.println(sdtt.format(k));
        double d= 2.99999999999999;
        int k = (int)d;
        System.out.println(k);
	}

}
