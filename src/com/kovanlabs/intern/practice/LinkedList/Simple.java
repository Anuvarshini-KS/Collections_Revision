package com.kovanlabs.intern.practice.LinkedList;
import java.util.*;
public class Simple {
    public static void main(String[]args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.addFirst(0);
        list.addLast(5);
        System.out.println(list);
    }
}
