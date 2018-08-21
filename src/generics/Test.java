package generics;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args){

        Living l = new Living();
        Animal a = new Animal();
        Plant p = new Plant();
        Dog d = new Dog();

        Living l1 = new Animal();
        Living l2 = new Plant();
        Living l3 = new Dog();


        //Animal a1 = new Living();

        Living lar[] = new Animal[10];


        ArrayList<Animal> al = new ArrayList<Animal>();
        Dog d1 = new Dog();

        al.add(d1);

        al.add(new Animal());

        method(al);




    }

    static void method(List<?> list)
    {
        Animal oref = (Animal)list.get(1);
        System.out.println(oref.getName());

    }
}
