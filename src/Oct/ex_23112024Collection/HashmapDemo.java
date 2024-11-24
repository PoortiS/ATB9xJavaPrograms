package Oct.ex_23112024Collection;
import java.util.*;
public class HashmapDemo {
    public static void main(String []args)
    {
        //Declaration
        //HashMap hm=new HashMap();
        //Map map=new HashMap();

        HashMap<Integer,String> hm=new HashMap<Integer, String>();

        //To add data in HASHMAP
        hm.put(101,"POO");
        hm.put(102,"POORTI");
        hm.put(103,"POORTISRI");
        hm.put(104,"POORTI SRI");

        // To get the Size of Hashmap
        System.out.println(hm);
        System.out.println(hm.size());

        //To remove Element from Hashmap
        hm.remove(101);
        System.out.println(hm);
        System.out.println(hm.get(102));

        //To get all Keys and Values
        System.out.println(hm.entrySet());

        //To Read data from Hashmap
        for(int k :hm.keySet()) {
            System.out.println(k + "" + hm.get(k));
        }

        //Using Iterator
        Iterator <Map.Entry<Integer,String>> IT = hm.entrySet().iterator();

        while(IT.hasNext())
        {
            Map.Entry <Integer,String> entry1=IT.next();
            System.out.println(entry1.getKey()+"    "+entry1.getValue());


        }
       // To Clear
        hm.clear();
        System.out.println(hm);


}}
