import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Dates {
 
 public static void main(final String[] args) {
    Date date = new Date();
    DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
    System.out.println(format1.format(date));
    DateFormat format2 = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
    System.out.println(format2.format(date));
  }
}
