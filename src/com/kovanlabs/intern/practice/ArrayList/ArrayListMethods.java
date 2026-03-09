package com.kovanlabs.intern.practice.ArrayList;
import java.util.*;
public class ArrayListMethods {
    public static void main(String[]args)
    {
       List<String> list = new ArrayList<>();
       //add an element by value
       list.add("Java");
       list.add("Python");
       list.add("C");
       System.out.println(list);
       //op : [Java, Python, C]


       //add an element with respect to index
       list.add(2,"C++");
       System.out.println(list);
       //op : [Java, Python, C++, C]


       //to get size of list
        System.out.println(list.size());
        //op : 4


        //to get value by index
        System.out.println(list.get(1));
        //op  :Python


        //replace a value
        list.set(1,"For");
        System.out.println(list);
        //op : [Java, For, C++, C]


        //to check if the element is present in the list
        System.out.println(list.contains("Java"));
        //op : true

        //to get the index of the element
        System.out.println(list.indexOf("C++"));
        //op : 2

        //to get the last index value
        System.out.println(list.lastIndexOf("Java"));
        //op : 0

        System.out.println(list.getFirst());
        //op : Java

        System.out.println(list.getLast());
        //op : C

        System.out.println(list.getClass());
        //op : class java.util.ArrayList

        //to ckeck if the list is empty
        System.out.println(list.isEmpty());
        //op :false

        //to sort the list
        Collections.sort(list);
        System.out.println(list);
        //op : [C, C++, For, Java]

        //reverse the list
        Collections.reverse(list);
        System.out.println(list);
        //op : [Java, For, C++, C]


        Iterator<String> it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();
        //op : Java For C++ C

        //sublist()
        System.out.println(list.subList(0,3));
        //op : [Java, For, C++]

        list.remove("C++");
        System.out.println(list);
        //op : [Java, For, C]


        list.clear();
        System.out.println(list);
        System.out.println(list.isEmpty());
        //op : true

    }
}
