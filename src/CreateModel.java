import sun.reflect.generics.tree.Tree;

import java.util.*;

public class CreateModel {

    public static void main(String[] args)
    {


        CHE cheRef = new CHE();
        CHE cheRef1 = new CHE();
        CHE cheRef2 = new CHE();
        CHE cheRef3 = new CHE();
        CHE cheRef4 = new CHE();


        Containers containerRef = new Containers();
        Containers containerRef1 = new Containers();
        Containers containerRef2 = new Containers();
        Containers containerRef3 = new Containers();
        Containers containerRef4 = new Containers();

        containerRef.setContainerId(1);
        containerRef1.setContainerId(1);
        containerRef2.setContainerId(3);
        containerRef3.setContainerId(4);
        containerRef4.setContainerId(5);
        containerRef.setContainerStatus("export");
        containerRef1.setContainerStatus("export");
        containerRef2.setContainerStatus("export");
        containerRef3.setContainerStatus("export");
        containerRef4.setContainerStatus("export");



        HashSet<Containers> containerList = new HashSet<>();
        containerList.add(containerRef);
        containerList.add(containerRef1);
        containerList.add(containerRef1);
        containerList.add(containerRef2);
        containerList.add(containerRef3);
        containerList.add(containerRef4);
/*
        for(Containers c:containerList)
        {

            System.out.println(c.getContainerId());
        }

*/
        Vessel vesselRef = new Vessel();
        Vessel vesselRef1 = new Vessel();
        Vessel vesselRef2 = new Vessel();
        Vessel vesselRef3 = new Vessel();
        Vessel vesselRef4 = new Vessel();


        TreeSet<String> tree = new TreeSet<>();
        tree.add("orange");
        tree.add("red");
        tree.add("blue");
        tree.add("green");
        tree.add("violet");

        System.out.println(tree);

        TreeSet<Containers> tree1 = new TreeSet<>();
        tree1.add(containerRef);
        tree1.add(containerRef1);
        tree1.add(containerRef2);
        tree1.add(containerRef3);
        tree1.add(containerRef4);

        System.out.println(tree1.size());


        HashMap<String,String> pairs = new HashMap<>();
        pairs.put("romeo","juliet");
        pairs.put("abc","xyz");
        pairs.put("rose","jack");
        pairs.put("tn","chennai");
        pairs.put("ind","delhi");
        System.out.println(pairs.get("rose"));
        Set keys = pairs.keySet();
        System.out.println(keys);
        Collection values = pairs.values();
        System.out.println(values);
        Set entries = pairs.entrySet();
        System.out.println(entries);

        Iterator iter = keys.iterator();
        while(iter.hasNext())
        {

            System.out.println(pairs.get(iter.next()));


        }




    }




}
