package com.kovanlabs.intern.practice.method;
import java.util.*;
import java.util.stream.Stream;
public class StreamError {
    public static void main(String[]args)
    {
        List<Integer> list = List.of(1,2,3,4,5);
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::println);
        //stream.count(); -> IllegalStateException

    }
}
