package com.kovanlabs.intern.practice;
import java.util.*;

public class IteratorPractice {
    public static void main(String[]args)
    {
        List<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(5);
        Iterator<Integer> it = num.iterator();
        while(it.hasNext())
        {
            int n = it.next();
            if(n % 2 != 0)
            {
                it.remove();
            }
        }
        System.out.println(num);
    }
}
