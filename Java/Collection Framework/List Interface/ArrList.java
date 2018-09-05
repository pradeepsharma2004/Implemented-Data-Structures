import java.util.*;
public class ArrList
{
public static void main(String args[])
{ 
       List al=new ArrayList();
       al.add("a");
       al.add("b");
       al.add("c");
       al.add("d");
       al.add("e");
       al.add("f");
       //Using Iterator to print al values
       Iterator itr=al.iterator();
       System.out.println("First ArrayList values");  
       while(itr.hasNext())
          { 
               System.out.println(itr.next());       
          }
       
        ArrayList al2=new ArrayList();
        al2.addAll(al);
        al2.add("g");
        al2.add("h");
        al2.removeAll(al);
        al2.addAll(al);
        System.out.println("Second ArrayList values");  
        //Using Enhance loop for printing
        for(Object ob:al2)
        {
             System.out.println(ob);
        }
}
}