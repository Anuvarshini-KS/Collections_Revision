package com.kovanlabs.intern.practice.method;
import java.util.*;
public class MultipleTraversals {
    public static void main(String[]args)
    {
        List<Integer> list = List.of(1,2,3,4,5);
        int max = list.stream()
                .max(Integer::compare)
                .get();
        int min = list.stream()
                .min(Integer::compare)
                .get();
        int sum = list.stream()
                .mapToInt(i->i)
                .sum();
        long count = list.stream()
                        .count();
        System.out.println("The maximum : "+max);
        System.out.println("The minimum : "+min);
        System.out.println("The sum : "+sum);
        System.out.println("The count : "+count);
    }
}
