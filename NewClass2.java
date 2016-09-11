

package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.HashSet;
import java.util.Set;


public class NewClass2 {
    public static void main(String[] args) throws IOException {
        Hashtable<String,Long> hm=new Hashtable<String,Long>();
        String name,str;
        Long phno;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true)
        {
            System.out.println("1. Enter Phone Enteries");
            System.out.println("2. Lookup in the Book");
            System.out.println("3. Display Names in book");
            System.out.println("4. Exit");

            System.out.println("Your Choice : ");
            int n=Integer.parseInt(br.readLine());

            switch(n)
            {
                case 1:
                    System.out.println("Enter Name : ");
                    name=br.readLine();
                    System.out.println("Enter Phno : ");
                     phno=Long.parseLong(br.readLine());

                     hm.put(name,phno);
                     break;
                case 2:
                      System.out.println("Enter Name : ");
                    name=br.readLine();
                    name=name.trim();
                    phno=hm.get(name);
                  System.out.println("Phone no : "+phno);
                    hm.remove(name);
                    System.out.println(hm);

                    break;
                case 3:Set<String> set=new HashSet<String>();
                set=hm.keySet();
                    System.out.println(set);
                    break;
                case 4:
                    return;




            }
        }

    }

}
// boolean isEmpty()
//int size()
//clear();
//remove(obj);