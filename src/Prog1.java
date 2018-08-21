import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Prog1{
    public static void main(String args[]){


        HashSet<String> al=new HashSet<>();
        al.add("Sai");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");

        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
System.out.println("End of hsahset");
        LinkedHashSet<String> al1=new LinkedHashSet<>();
        al1.add("Sai");
        al1.add("Vijay");
        al1.add("Ravi");
        al1.add("Ajay");

        Iterator itr1=al1.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }


  System.out.println("end of linkedhash set");

        TreeSet<String> al2=new TreeSet<>();
        al2.add("Sai");
        al2.add("Vijay");
        al2.add("Ravi");
        al2.add("Ajay");

        Iterator itr2=al2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }




    }
}
