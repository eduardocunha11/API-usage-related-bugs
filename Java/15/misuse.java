import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.netbeans.lib.cvsclient.util.LoggedDataInputStream;

class ModTimeResponse implements Response {
    protected static final SimpleDateFormat dateFormatter;
    protected static final String SERVER_DATE_FORMAT = "dd MMM yyyy HH:mm:ss"; 
    
    static {
      dateFormatter = new SimpleDateFormat(SERVER_DATE_FORMAT, Locale.US);
    }
	
    @Override
    public void process(LoggedDataInputStream dis, ResponseServices services) throws ResponseException {
	      try {
	        String dateString = dis.readLine();
	        Date date = dateFormatter.parse(dateString.substring(0, dateString.length() - 6));
	        if (date.getTime() < 0) {
		        if (date.getYear() < 100 && date.getYear() >= 70) {
			        date.setYear(date.getYear() + 1900);
		        } else if (date.getYear() >= 0 && date.getYear() < 70) {
		          date.setYear(date.getYear() + 2000);
		        } else {
		          date.setYear(2000 + date.getYear());
		        }
	        }
	     } catch (Exception e) {
	        throw new ResponseException(e);
	     }
    }
}
