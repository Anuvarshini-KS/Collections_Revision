package com.kovanlabs.intern.practice.TerminalMethod;
import java.util.*;
public class TerminalMethods {
    public static void main(String[]args)
    {
        List<Integer> num = List.of(1,2,3,4,5);
        //Iteration/Side effect
        num.stream().forEach(System.out::print);
        //op : 12345
        System.out.println();
        //reduction
        int sum = num.stream()
                .reduce(0,(a,b)-> a+b);
        System.out.println(sum);//op : 15

        //without identity
        Optional<Integer> max = num.stream()
                .reduce(Integer::max);
        System.out.println(max);
        //op : Optional[5]

        Optional<Integer> min = num.stream()
                .reduce(Integer::min);
        System.out.println(min);

        Optional<Integer> sums = num.stream()
                .reduce(Integer::sum);
        System.out.println(sums);

    }
}
