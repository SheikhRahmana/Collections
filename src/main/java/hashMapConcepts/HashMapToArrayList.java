package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapToArrayList {
    public static void main(String[] args) {
        HashMap<String,Integer> cmHm= new HashMap<String,Integer>();
        cmHm.put("Google",500);
        cmHm.put("Microsoft",520);
        cmHm.put("Lenovo",580);
        // how to get key and value
        Iterator it=cmHm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry mp=(Map.Entry) it.next();
            System.out.println(mp.getKey()+": "+mp.getValue());
        }
        ArrayList<String> listNme=new ArrayList<String>(cmHm.keySet());
        for (int i=0;i<listNme.size();i++){
            System.out.println(listNme.get(i));
        }
        ArrayList<Integer>listValue= new ArrayList<Integer>(cmHm.values());
        for (Integer e:listValue){
            System.out.println(e);
        }
    }
}
