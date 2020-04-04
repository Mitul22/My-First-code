import java.io.*;
import java.lang.*;
import java.util.*;
class Parent
{
    public void display()
    {
        System.out.println("This is from parent class");
    }
    public void display(int a ,int b,int c)
    {
        System.out.println("Calculation of numbers is "+(a+b*c));
    }
}
interface Par
{
    public void show();
    public void getn();
}
class Herit extends Parent implements Par
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
         Herit ob=new Herit();
         ob.display();
         int n=obj.nextInt();
         ob.display(n,n-1,n+7);
         ob.show();
    }
    public void show()
    {
        System.out.println("This is method of abstraction");
    }
    public void getn()
    {
        System.out.println("The name of class is herit");
    }
}