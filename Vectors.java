

package collections;

import java.util.ListIterator;
import java.util.Vector;


public class Vectors {
    public static void main(String[] args) {
        Vector<Integer> v=new Vector<Integer>();
        int x[]={22,20,10,40,15,60};
        for(int i=0;i<x.length;i++)
        {
            v.add(x[i]);
        }
        System.out.println("Vector Elements : ");
          for(int i=0;i<v.size();i++)
        {
            System.out.println(v.get(i));
        }
        System.out.println("Elements Using ListIterator : ");
        ListIterator lit=v.listIterator();

        System.out.println("In forward Direction : ");
        while(lit.hasNext())
            System.out.print(lit.next()+"\t");
        System.out.println("");
          System.out.println("In Backword Direction : ");
        while(lit.hasPrevious())
            System.out.print(lit.previous()+"\t");
    }

}
