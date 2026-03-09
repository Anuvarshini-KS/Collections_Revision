package com.kovanlabs.intern.practice.ArrayList;

import java.util.*;

public class Simple {
    public static void main(String[] args)
    {
        Collection<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Kiwi");
        fruit.add("Berry");
        System.out.println("The arraylist : "+fruit);
        //op The arraylist : [Apple, Banana, Kiwi, Berry]
        for(String name : fruit)
        {
            System.out.print(name);
        }
        //op: AppleBananaKiwiBerry
    }
}
