package arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        /*
        Arraylist is a default class in java and it beaves like dynamic array.
        it main tain order such as 0,1,2,3,4 when we insert data
        static Array
         */
        int l[]=new int[4];// maximum capacity   4

        ArrayList ar= new ArrayList();//default generic we can store any type of data
        //   Virtual capacity of an  ArrayList is   10
        ar.add(100);
        ar.add("Sam");
        ar.add('T');
        ar.add(10.20);
        ar.add(true);
        System.out.println(ar);
        for (int i=0;i<ar.size();i++){
            System.out.println(ar.get(i));
        }
        /*
        I also can specify data type in array list
         */
       ArrayList<Object> ob= new ArrayList<Object>();
        ob.add(100);
        ob.add("Sam");
        ob.add('T');
        ob.add(10.20);
        ob.add(true);
        System.out.println(ob.get(2));
        System.out.println(ob.get(3));
        try {
            System.out.println(ob.get(-1));
            System.out.println(ob.get(6));
        }catch (Exception e){

        }
        System.out.println("Hi.......");

        ArrayList<String > st= new ArrayList<String>();
        st.add("Sam");
        st.add("Mark");
        st.add("John");
        st.add("Michle");
        System.out.println(st.size());
        System.out.println(st);
        ArrayList<Integer> itr= new ArrayList<Integer>();
        itr.add(100);
        itr.add(200);
        itr.add(300);
        itr.add(400);
        System.out.println(itr);
        System.out.println(itr.size());
        itr.remove(1);
        System.out.println(itr.size());
        ArrayList<String> arr= new ArrayList<String>(20);

        //Top Custing
        List<Integer> li= new ArrayList<Integer>(); // TOP CUSTING

        ArrayList<String>star= new ArrayList<String>(Arrays.asList("Sam","John","Mike","Don"));
        System.out.println(star.size());
        System.out.println(star);

        /*
          Using   Add  all method in ArrayList
         */
        st.addAll(star);
        System.out.println(st);
        System.out.println(st.size());
        System.out.println(st.remove(2));
        System.out.println(st);
        System.out.println(st.size());
       // ar.clear();
        System.out.println(ar);
       ArrayList<String>cloneList= (ArrayList<String>)ar.clone();
        System.out.println(cloneList);
        System.out.println(ar.contains(100));
        ArrayList<Integer> num= new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        /*
        remove even numbers
         */
        num.removeIf(nums->nums%2==0);
        System.out.println(num);
        /*
        converting ArrayList to Array
         */
        ArrayList<String>lst= new ArrayList<String>(Arrays.asList("Sam","John","Mike","Don"));
        Object obs[]=lst.toArray();
        System.out.println(obs);
        System.out.println(Arrays.toString(obs));

    }
}
