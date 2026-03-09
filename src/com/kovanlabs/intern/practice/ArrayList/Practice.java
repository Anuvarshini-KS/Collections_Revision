package com.kovanlabs.intern.practice.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Practice {
    static void printValues(ArrayList<Integer> list)
    {
        System.out.println("The values of array");
        //using iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }
        System.out.println();

        //using for each loop
        for(int num  :list)
        {
            System.out.print(num+" ");
        }
        System.out.println();
    }

    static void sumOfList(ArrayList<Integer> list)
    {
        int sum=0;
        for(int num : list)
        {
            sum+=num;
        }
        System.out.println("The sum of the list : "+sum);
    }

    static void maxElement(ArrayList<Integer> list)
    {
        int max=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)>max)
            {
                max = list.get(i);
            }
        }
        System.out.println("The maximum element is "+max);
    }

    static void removeEven(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i)%2 == 0)
            {
                list.remove(i);
            }
        }
        System.out.println("List after removing even number "+list);
    }
    static void reverseElement(ArrayList<Integer> list)
    {
        int left=0, right= list.size()-1;
        while(left<right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;
        }
        System.out.println("The reversed List : "+list);
    }
    static void removeDuplicate(ArrayList<Integer> list)
    {
        for(int i=0;i<list.size()-1;i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    list.remove(j);
                }
            }
        }
        System.out.println("The list after removing duplicate element "+list);
    }
    static void secondMax(ArrayList<Integer> list)
    {
        int max=0,smax=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) > max) {
                smax=max;
                max = list.get(i);

            }
        }
        System.out.println("The second maximum element in the list is "+smax);
    }
    static void frequencyOfElements(ArrayList<Integer> list)
    {
        System.out.println("Frequency of elements");
        ArrayList<Integer> visited = new ArrayList<>();
        for(int i=0;i<list.size();i++)
        {
            if(visited.contains(list.get(i)))
            {
                continue;
            }
            int count = 1;
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i).equals(list.get(j)))
                {
                    count++;
                }
            }
            visited.add(list.get(i));
            System.out.println(list.get(i) +" occurs "+count);
        }
    }
    static void rotateElement(ArrayList<Integer> list,int k)
    {
        int n=list.size();
        if(k > n)
        {
            k %= n;
        }
        ArrayList<Integer> result = new ArrayList<>();
        if(n==0)
        {
            return;
        }
        for(int i=n-k;i<n;i++)
        {
            result.add(list.get(i));
        }
        for(int i=0;i<n-k;i++)
        {
            result.add(list.get(i));
        }
        list.clear();
        list.addAll(result);
        System.out.println("The rotated list with key "+k+" is "+list);

    }
    public static void main(String[]args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(7);
        list.add(6);
        list.add(5);
        list.add(4);
//        list.add(10);
//        list.add(7);
//        list.add(10);
//        list.add(4);
//        list.add(7);
//        list.add(11);
//        list.add(21);
//        printValues(list);
//        sumOfList(list);
//        maxElement(list);
//        removeEven(list);
//        reverseElement(list);
        //removeDuplicate(list);
        //secondMax(list);
        //frequencyOfElements(list);
        rotateElement(list,7);
    }
}
