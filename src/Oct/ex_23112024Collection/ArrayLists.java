package Oct.ex_23112024Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class ArrayLists {

    public static void main(String []args)
    {
        //Declaration of ArrayList for hetrogenous data

        ArrayList ar1=new ArrayList();
        List l1=new ArrayList();
        ar1.add(1000);
        ar1.add(1.7);
        ar1.add("Stringing");
        ar1.add(null);
        ar1.add(1000);
        ar1.add(1000);

        System.out.println(ar1);
        System.out.println(ar1.size());

        //To remove duplicate element
        ar1.remove(5);
        System.out.println(ar1);

        //To insert new element in middle of Arraylist
        ar1.add(2,"Poorti");
        System.out.println(ar1);

        //To modify the Element
        ar1.set(2,"POORTI SRI");
        System.out.println(ar1);

        //To access Spefic Value from List
        System.out.println(ar1.get(3));

        //Delaration of ArrayList for homogenous data

        //ArrayList <String>ar2 =new ArrayList<String>();

      Iterator <Objects>IT=ar1.iterator();
      while(IT.hasNext()) {
          System.out.println(IT.next());
      }

      //To know if Empty or not
        System.out.println(ar1.isEmpty());
      //To Remove aal the elements of ArrayList

        ArrayList ar2=new ArrayList();
        ar2.add(100);
        ar2.add("POO");
        ar2.add(9.0);
        System.out.println(ar2);
        ar1.removeAll(ar2);
        System.out.println(ar2);

        //to clear all the elements
        ar1.clear();
        System.out.println(ar1);



    }
}
