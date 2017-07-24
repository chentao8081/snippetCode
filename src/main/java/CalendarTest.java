import java.util.Calendar;
import java.util.Date;

public class CalendarTest {
    public static void main(String[] args) {
        Date date1 = new Date();
        System.out.println(date1);
        System.out.println("=============");
        Calendar createCalendar = Calendar.getInstance();
        //createCalendar.setTime(date1);
        System.out.println(createCalendar.getTime());
        System.out.println("============= +2d");
        createCalendar.add(Calendar.DAY_OF_MONTH, 17);
        System.out.println(date1);
        System.out.println(createCalendar.getTime());
    }
}
