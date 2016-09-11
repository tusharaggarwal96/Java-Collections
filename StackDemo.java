

package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
public class StackDemo {
    public static void main(String[] args) throws IOException {
        Stack<Integer> st=new Stack<Integer>();
        int choice=0;
        int position,element;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(choice<4)
        {
            System.out.println("Stack Operations");
            System.out.println("1:Push an Element");
             System.out.println("2:Pop an Element");
              System.out.println("3:Search an Element");
               System.out.println("4:Exit");
               System.out.println("Your Choice");
               choice=Integer.parseInt(br.readLine());
               switch(choice)
               {
                   case 1:
                       System.out.println("Enter Element : ");
                       element=Integer.parseInt(br.readLine());
                       st.push(element);
                       //System.out.println("top : "+st.peek());
                       break;
                       case 2:

                       Integer obj=st.pop();
                           System.out.println("Popped =  "+obj);
                       break;
                        case 3:
                       System.out.println("Which Element ? : ");
                       element=Integer.parseInt(br.readLine());
                       position=st.search(element);
                       if(position==-1)
                                System.out.println("Element Not Found");
                       else
                                System.out.println("Position : "+position);
                       break;
                       default:
                           return;
               }
               System.out.println("Stack contents : "+st);
        }
    }

}
