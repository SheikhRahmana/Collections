package findOutDuplicate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DuplicateStringWords {
    public static void findDuplicateWords(String sts){
        Map<String,Integer>mp= new HashMap<String, Integer>();
  String st[]=sts.split(" ");
       for (String s:st){
           //System.out.println(s);
           if(mp.get(s)!= null){
             mp.put(s,mp.get(s)+1);
           }else {
               mp.put(s, 1);
           }
       }
       Iterator<String> it=mp.keySet().iterator();
       while (it.hasNext()){
           String kys=it.next();
           if(mp.get(kys)>1){
               System.out.println(kys+": "+mp.get(kys));
           }
       }
        //System.out.println(mp);
    }
    public static void main(String[] args) {
        findDuplicateWords("i am not an not am job going am to job the told job am ");
    }
}
