

package collections;

import java.util.StringTokenizer;


public class StringTokenizer1 {
    public static void main(String[] args) {
        String str="This is core java";
        StringTokenizer s=new StringTokenizer(str, " ");
        System.out.println("My Result:");
          System.out.println(s.countTokens());
        while(s.hasMoreTokens())
        {
            System.out.println(s.nextToken());
        }
        System.out.println(str);
 
      
    }

}
