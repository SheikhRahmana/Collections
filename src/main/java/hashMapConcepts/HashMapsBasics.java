package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapsBasics {
    /*

     */
    public static void main(String[] args) {
        HashMap<String,String >cap= new HashMap<String ,String>();
        cap.put("Bangladesh","Dhaka");
        cap.put("Afghanistan","Kabul");
        cap.put("Pakistan","Islamabad");
        cap.put("India","New Delli");
        cap.put("India","Delli");
        System.out.println(cap);
        System.out.println(cap.get("Afghanistan"));
        System.out.println(cap.get("India"));// Key can not be duplicate it is giving the latest value
        //we can store  multiple null value
        cap.put("Japan",null);
        cap.put("Nepal",null);
        // we can have latest null key value
        cap.put(null,"Toronto");
        cap.put(null,"Rome");
        System.out.println(cap.get(null));


        Iterator<String> caps=cap.keySet().iterator();
        while (caps.hasNext()){
           String key= caps.next();
           String value=cap.get(key);
            System.out.println(key +": "+value);
        }
    }
}
