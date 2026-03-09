package com.kovanlabs.intern.practice.IntermediateMethod;
import java.util.*;
import java.util.stream.Collectors;

public class IntermediateMethods {
    public static void main(String[]args) {
        List<Integer> number = List.of(1,2,3,4,5);
        //List<String> name = List.of("Ram","Janu","Tamil","Giri");
//        number.stream()
//                .filter(n-> n%2==0)
//                .forEach(System.out::print);
        //op : 24

//        number.stream()
//                .map(n->n*2) //multiply the values by 2
//                .forEach(System.out::print); //displays the output
        //op:246810

//        number.stream()
//                .distinct() //removes duplicates
//                .forEach(System.out::print);
        //op:123456

//        number.stream()
//                .sorted()//sorts the list
//                .forEach(System.out::print);
        //op:2334578

//        number.stream()
//                .sorted((a,b)->b-a)//descending order
//                .forEach(System.out::print);
        //op : 8754332

//        number.stream()
//                .sorted((a,b) -> a-b)
//                .limit(2)
//                .forEach(System.out::print);
        //op : 23

//        number.stream()
//                .skip(3)//skips 1st threee elements
//                .forEach(System.out::print);
//        //op:45

        List<Integer> even = number.stream()
                .filter(n-> n%2==0)
                .collect(Collectors.toList());
        System.out.print(even+" ");


    }
}
