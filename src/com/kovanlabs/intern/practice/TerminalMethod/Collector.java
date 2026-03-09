package com.kovanlabs.intern.practice.TerminalMethod;

import java.util.*;
import java.util.stream.Collectors;

public class Collector {
    public static void main(String[]args)
    {
        List<Integer> number = List.of(1,2,4,5,6,8,2,3,4,6);
        //toList
//        List<Integer> list = number.stream()
//                .filter(n-> n%2==0)
//                .collect(Collectors.toList());
//        System.out.println("The list : "+list);
//
//        //toSet
//        Set<Integer> set = number.stream()
//                .map(n->n*2)
//                .collect(Collectors.toSet());
//        System.out.println("The set "+set);
//
//        LinkedList<Integer> linkedList = number.stream()
//                .collect(Collectors.toCollection(LinkedList::new));
//        System.out.println("The Linked List : "+linkedList);

        number.stream().filter(n->n%2==0).map(n-> n*2).forEach(System.out::println);

    }
}
