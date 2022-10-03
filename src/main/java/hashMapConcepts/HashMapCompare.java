package hashMapConcepts;

import java.util.HashMap;
import java.util.Map;

public class HashMapCompare {
    public static void main(String[] args) {
        HashMap<Integer,String>compre= new HashMap<>();
        compre.put(1,"A");
        compre.put(2,"B");
        compre.put(3,"C");

       HashMap<Integer,String >compre1=new HashMap<>();
       compre1.put(3,"c");
       compre1.put(2,"B");
       compre1.put(1,"A");
        Map<Integer,String> compre2= new HashMap<Integer,String>();
        compre2.put(3,"C");
        compre2.put(1,"A");
        compre2.put(2,"B");
        System.out.println(compre.equals(compre1));//false  Why???
        System.out.println(compre.equals(compre2));

    }


}
