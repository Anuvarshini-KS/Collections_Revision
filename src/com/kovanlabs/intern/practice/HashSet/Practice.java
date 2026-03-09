package com.kovanlabs.intern.practice.HashSet;

import java.util.*;
public class Practice {

        // 1. Add Elements to HashSet
        public void addElements() {
            HashSet<Integer> set = new HashSet<>();
            set.add(10);
            set.add(20);
            set.add(30);
            set.add(40);

            System.out.println("Elements in set: " + set);
        }
        //op : Elements in set: [20, 40, 10, 30]

        // 2. Check if element exists
        public void checkElement() {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(5,10,15,20));

            if(set.contains(10))
                System.out.println("Element exists");
            else
                System.out.println("Element not found");
        }


        // 3. Remove element
        public void removeElement() {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3,4));

            set.remove(3);

            System.out.println("After removal: " + set);
        }

        // 4. Find size of HashSet
        public void setSize() {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(10,20,30));

            System.out.println("Size: " + set.size());
        }

        // 5. Iterate through HashSet
        public void iterateSet() {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(100,200,300));

            for(Integer num : set)
                System.out.println(num);
        }

        // 6. Remove duplicates from Array
        public void removeDuplicates() {
            int[] arr = {1,2,2,3,4,4,5};

            HashSet<Integer> set = new HashSet<>();

            for(int num : arr)
                set.add(num);

            System.out.println("Unique elements: " + set);
        }

        // 7. Union of two sets
        public void unionSet() {
            HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
            HashSet<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5));

            set1.addAll(set2);

            System.out.println("Union: " + set1);
        }

        // 8. Intersection of two sets
        public void intersectionSet() {
            HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3));
            HashSet<Integer> set2 = new HashSet<>(Arrays.asList(2,3,4));

            set1.retainAll(set2);

            System.out.println("Intersection: " + set1);
        }

        // 9. Convert HashSet to ArrayList
        public void convertToList() {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(10,20,30));

            ArrayList<Integer> list = new ArrayList<>(set);

            System.out.println("ArrayList: " + list);
        }

        // 10. Clear HashSet
        public void clearSet() {
            HashSet<Integer> set = new HashSet<>(Arrays.asList(1,2,3));

            set.clear();

            System.out.println("After clear: " + set);
        }


        public static void main(String[] args) {

            Practice set = new Practice();

            set.addElements();
            set.checkElement(); //Element exists
            set.removeElement(); //After removal: [1, 2, 4]
            set.setSize(); // Size: 3
            set.iterateSet(); //100 200 300
            set.removeDuplicates(); //Unique elements: [1, 2, 3, 4, 5]
            set.unionSet(); //Union: [1, 2, 3, 4, 5]
            set.intersectionSet(); //Intersection: [2, 3]
            set.convertToList();//ArrayList: [20, 10, 30]
            set.clearSet(); //After clear: []
        }
    }

