package hashMapConcepts;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String,Integer> mrks= new Hashtable<String,Integer>();
        mrks.put("John",200);
        mrks.put("Sam",250);
        mrks.put("Unds",300);
        mrks.put("Mike",350);

        try {
            mrks.put(null,100);
        }catch (Exception e){

        }

        System.out.println(mrks.get("Mike"));

       Iterator<String> ke= mrks.keySet().iterator();
       while (ke.hasNext()){
          String key= ke.next();
          Integer value =mrks.get(key);
           System.out.println(key+": "+value);
       }
    }
}
