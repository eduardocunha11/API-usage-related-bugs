import java.util.*;

public class ToString {
    public static void main(String[] args) {
        Map<String, String> m = new IdentityHashMap<String, String>();
        
        Set<Map.Entry<String, String>> es = m.entrySet();
        m.put("beer", "good");
		    m.put("beer", "bad");
		    System.out.println(m.size());
		
        Iterator<Map.Entry<String, String>> i = es.iterator();
        System.out.println(i); 
        i.next();
        System.out.println(i);
    }
}   
