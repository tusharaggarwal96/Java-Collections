

package collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> ar1=new ArrayList<String>();
        ar1.add("Apple");
        ar1.add("Mango");
        ar1.add("Guave");
        ar1.add("Grapes");
        ar1.add(2,"Pomegranate");
        System.out.println("Contents :"+ar1);
        ar1.remove(3);
        boolean obj=ar1.contains("ac");
        System.out.println(obj);
          ar1.remove("Apple");
          System.out.println("Contents after Removing :"+ar1);
     //     ar1.clear();
          System.out.println("----------------------------");
              System.out.println("Contents after Removing :"+ar1);
               System.out.println("----------------------------");
   System.out.println("Size of ArrayList : "+ar1.size());
          System.out.println("Extracting using Iterator : ");
          Iterator it=ar1.iterator();
          while(it.hasNext())
          {
              System.out.println(it.next());

          }

    }

}
//indexof
//lastIndexOf
//get(position)
