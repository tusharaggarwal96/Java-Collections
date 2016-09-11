

package collections;

import java.util.HashSet;
import java.util.Iterator;
public class Main {
public static void main(String[] args) {
       HashSet<String> hs=new HashSet<String>();
       hs.add("India");
          hs.add("China");
         hs.add("America");
           hs.add("Japan");
          
           hs.remove("America");
        //   hs.clear();
              System.out.println("Hash Set = "+hs);
     Iterator it=hs.iterator();
               System.out.println("Element Using Iterator : ");
               while(it.hasNext())
               {
                   String s=(String)it.next();
                   System.out.println(s);
               }
               /*1)boolean add(obj)
		2)boolean remove(obj)
		3)void clear()
		4)boolean contains(obj)
		5)boolean isEmpty()
		6)int size()*/
    }

}
