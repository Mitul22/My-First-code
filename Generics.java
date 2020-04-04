import java.util.*;
class Generics <Data>
{
    Data T;
    // public <Data> void printArray(Data S[])
    // {
    //     for(int i=0;i<S.length;i++)
    //     System.out.print(S[i]+" ");
    // }
     public Generics(Data S1)
     {  
          T=S1;   
     }
      public Data get()
      {
             return T;
      }
    public static void main(String args[])
    {
        Generics<String> obj=new Generics<String>("Partition1948");
        //String events[]={"Partition1948","Dhandhi Movement",};
        // Integer dates[]={1948,1931};
        Generics<Integer> obj2=new Generics<Integer>(1948);
        System.out.println(obj.get());
        System.out.println(obj2.get());
    }
}