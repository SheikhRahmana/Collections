package hashMapConcepts;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        Map<String,Integer> lnkdHmp= new LinkedHashMap<String,Integer>();
        lnkdHmp.put("Sam",100);
        lnkdHmp.put("John",200);
        lnkdHmp.put("Mike",300);
        lnkdHmp.put("Adam",400);
        lnkdHmp.put(null,500);
        Iterator<String> ln=lnkdHmp.keySet().iterator();
        while (ln.hasNext()){
            String key=ln.next();
            Integer value=lnkdHmp.get(key);
            System.out.println(key +": "+value);

        }

    }
}
