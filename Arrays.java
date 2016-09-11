

package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee
{
    int id;
    String name;
    Employee(int id,String name)
    {
        this.id=id;
        this.name=name;
    }
    void displaydata(){
        System.out.println("Id is "+id+ " Name is "+name);
    }
}
public class Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Employee[] arr=new Employee[3];
        for(int i=0;i<=2;i++)
        {
            System.out.println("Enter Id : ");
           int id=Integer.parseInt(br.readLine());   
             System.out.println("Enter Name : ");
           String name=br.readLine();
           arr[i]=new Employee(id, name);
        }
        for(int i=0;i<=2;i++)
            arr[i].displaydata();
    }

}
