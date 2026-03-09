package com.kovanlabs.intern.practice.HashMap;
import java.util.*;

    public class HashMapPractice {

        // 1. Add elements to HashMap
        public void addElements() {
            HashMap<Integer, String> map = new HashMap<>();

            map.put(1, "Apple");
            map.put(2, "Banana");
            map.put(3, "Mango");

            System.out.println("Map: " + map);
        }
        // op : Map: {1=Apple, 2=Banana, 3=Mango}

        // 2. Get value using key
        public void getValue() {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "Red");
            map.put(2, "Blue");

            System.out.println("Value for key 1: " + map.get(1));
        }
        //op : Value for key 1: Red

        // 3. Check if key exists
        public void checkKey() {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(10, "A");
            map.put(20, "B");

            if(map.containsKey(10))
                System.out.println("Key exists");
            else
                System.out.println("Key not found");
        }
        //op : Key exists

        // 4. Remove element
        public void removeElement() {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "Java");
            map.put(2, "Python");

            map.remove(1);

            System.out.println("After removal: " + map);
        }
        //After removal: {2=Python}

        // 5. Iterate through HashMap
        public void iterateMap() {
            HashMap<Integer, String> map = new HashMap<>();
            map.put(1, "A");
            map.put(2, "B");
            map.put(3, "C");

            for(Map.Entry<Integer,String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
        // op : 1 -> A
        //2 -> B
        //3 -> C

        // 6. Find frequency of elements in array
        public void frequencyCount() {
            int[] arr = {1,2,2,3,3,3,4};

            HashMap<Integer,Integer> map = new HashMap<>();

            for(int num : arr) {
                map.put(num, map.getOrDefault(num,0) + 1);
            }

            System.out.println("Frequency: " + map);
        }
        //op : Frequency: {1=1, 2=2, 3=3, 4=1}

        // 7. Count characters in a string
        public void charCount() {
            String str = "programming";

            HashMap<Character,Integer> map = new HashMap<>();

            for(char c : str.toCharArray()) {
                map.put(c, map.getOrDefault(c,0) + 1);
            }

            System.out.println("Character count: " + map);
        }
        //op : Character count: {p=1, a=1, r=2, g=2, i=1, m=2, n=1, o=1}

        // 8. Find max value in HashMap
        public void findMaxValue() {
            HashMap<String,Integer> map = new HashMap<>();

            map.put("A",10);
            map.put("B",50);
            map.put("C",30);

            int max = Collections.max(map.values());

            System.out.println("Maximum value: " + max);
        }
        //op : Maximum value: 50

        // 9. Check if map is empty
        public void checkEmpty() {
            HashMap<Integer,Integer> map = new HashMap<>();

            System.out.println("Is map empty? " + map.isEmpty());
        }
        //op : Is map empty? true

        // 10. Clear map
        public void clearMap() {
            HashMap<Integer,String> map = new HashMap<>();

            map.put(1,"A");
            map.put(2,"B");

            map.clear();

            System.out.println("After clear: " + map);
        }
        //op : After clear: {}

        public static void main(String[] args) {

            HashMapPractice obj = new HashMapPractice();

            obj.addElements();
            obj.getValue();
            obj.checkKey();
            obj.removeElement();
            obj.iterateMap();
            obj.frequencyCount();
            obj.charCount();
            obj.findMaxValue();
            obj.checkEmpty();
            obj.clearMap();
        }
    }

