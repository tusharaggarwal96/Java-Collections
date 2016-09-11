

package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class LinkedListDemo {
    public static void main(String[] args) throws IOException {
          LinkedList<Integer> st=new LinkedList<Integer>();
          st.add(11);
          st.add(22);
          st.add(33);
          System.out.println("List = "+st);
        int choice=0;
        int position;
        int element;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(choice<4)
        {
            System.out.println("LinkedList Operations");
            System.out.println("Add an Element");
             System.out.println("Remove an Element");
              System.out.println("Change an Element");
               System.out.println("Exit");
               System.out.println("Your Choice");
               choice=Integer.parseInt(br.readLine());
               switch(choice)
               {
                   case 1:
                       System.out.println("Enter Element : ");
                       element=Integer.parseInt(br.readLine());
                       System.out.println("At What Position?");
                       position=Integer.parseInt(br.readLine());
                       st.add(position-1,element);
                       break;
                       case 2:

                     System.out.println("Enter Position?");
                       position=Integer.parseInt(br.readLine());
                       st.remove(position-1);
                       break;
                        case 3:
                     System.out.println("Enter Position?");
                       position=Integer.parseInt(br.readLine());
                         System.out.println("Enter new Element : ");
                       element=Integer.parseInt(br.readLine());
                         st.set(position-1,element);
                       break;
                       default:
                           return;
               }
               System.out.println("LinkedList contents : "+st);
        }
    }

}
