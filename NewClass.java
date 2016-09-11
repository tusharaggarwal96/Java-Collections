
package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Enumeration;
import java.util.Hashtable;


public class NewClass {
    public static void main(String[] args) throws IOException {
        Hashtable<String,Integer> ht=new Hashtable<String,Integer>();
        ht.put("Ajay",50);
           ht.put("sachin",77);
              ht.put("gavaskar",44);
                 ht.put("kapil",60);
                    ht.put("dhoni",88);

                    System.out.println("The Player Names : ");
                    Enumeration e=ht.keys();
                    while(e.hasMoreElements())
                        System.out.println(e.nextElement());

                    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                    System.out.println("Enter Player Names : ");
                    String name=br.readLine();
                    name=name.trim();
                    Integer score=ht.get(name);
                    if(score!=null)
                    {
                        int sc=score.intValue();
                        System.out.println(name + " Scored:  "+sc);
                    }
 else
            System.out.println("Player not found");

    }

}
