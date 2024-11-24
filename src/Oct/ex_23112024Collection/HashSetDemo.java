package Oct.ex_23112024Collection;

import java.util.*;

public class HashSetDemo {

    public static void main(String []args)
    {
        //Declaration

        HashSet hs1=new HashSet();
        //Set hs2=new HashSet();
        //HashSet <String> hs3=new HashSet<String>();

        //Adding Elements

        hs1.add("POORTI");
        hs1.add(900);
        hs1.add(90.1);
        hs1.add(900);
        hs1.add(null);
        hs1.add(900);
        hs1.add(null);

        System.out.println(hs1);
       // to remove the element
        hs1.remove(900);
        System.out.println("After Removal "+hs1);

        //Insering Element - Not Possible
       // Accessing specific value - Not Possible

        //Convering Hashset into Arraylist

        ArrayList ar=new ArrayList(hs1);
        System.out.println(ar);
        System.out.println(ar.get(2));

        //Read all elements

        for(Object ob:hs1)
        {
            System.out.println(ob);
        }
     //Using Iterator

        Iterator <Object> IT = hs1.iterator();

        while(IT.hasNext())
        {
            System.out.println(IT.next());
            }

        //Size of Hashset

        System.out.println(hs1.size());
        }
    }

