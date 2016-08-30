import java.io.*;
import java.util.*;
public class GetTime {
	
	public static void main (String[] args) {
		try {
			String temp="";
			if ((oldtime!=null)&&(args.length==0)) {
				long time1=Long.parseLong(temp);
				long newtime=new Date().getTime();
				float time=(float)(newtime-time1)/1000;
			}
			else {
				long time= new Date().getTime();
  			}
  	}
  	catch(IOException ioe) {
        System.out.println("Cannot open file");
    }
    catch(NumberFormatException nfe){
    }
	}
}
