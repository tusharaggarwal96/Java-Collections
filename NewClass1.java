
package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee{
    int id;
    String name;

    public Employee(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public void show(){
        System.out.println(id);
        System.out.println(name);
    }


}
public class NewClass1 {
    public static void main(String[] args) throws IOException{
        Employee obj[]=new Employee[5];
        for(int i=0;i<5;i++)
        {
            System.out.println("enter id");
            BufferedReader  br= new BufferedReader(new InputStreamReader(System.in)) ;
           int a = Integer.parseInt(br.readLine());
            System.out.println("enter name");
            String str = br.readLine();
            obj[i]=new Employee(a,str);
        }
        for(int i=0;i<5;i++)
        {
            obj[i].show();}

        }
    }

