
import java.util.Calendar;
import java.util.TimeZone;

public class Java_A52_CalenderClass {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		
		System.out.println(c.getCalendarType());
		System.out.println(c.getTimeZone().getID());
		System.out.println(c.getTime());
		
//		Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/India"));
//		
//		System.out.println(c.getCalendarType());
//		System.out.println(c.getTimeZone().getID());
		
		
	}
}
