package com.kovanlabs.intern.practice.LinkedList;

import java.util.*;
public class Practice {

        LinkedList<Integer> list = new LinkedList<>();

        // 1. Insert Elements
        public void insertElements() {
            list.add(10);
            list.add(20);
            list.add(30);
            list.add(40);
            list.add(20);
            list.add(50);
        }

        // 2. Display LinkedList
        public void displayList() {
            System.out.println("LinkedList: " + list);
        }

        // 3. Reverse LinkedList
        public void reverseList() {
            Collections.reverse(list);
            System.out.println("Reversed List: " + list);
        }

        // 4. Find Middle Element
        public void findMiddle() {
            int middle = list.get(list.size() / 2);
            System.out.println("Middle Element: " + middle);
        }

        // 5. Remove Duplicates
        public void removeDuplicates() {
            Set<Integer> set = new LinkedHashSet<>(list);
            list.clear();
            list.addAll(set);
            System.out.println("After removing duplicates: " + list);
        }

        // 6. Search Element
        public void searchElement(int key) {
            if (list.contains(key)) {
                System.out.println(key + " found in list");
            } else {
                System.out.println(key + " not found");
            }
        }

        public static void main(String[] args) {

            Practice obj = new Practice();

            obj.insertElements();
            obj.displayList();
            obj.reverseList();
            obj.findMiddle();
            obj.removeDuplicates();
            obj.searchElement(30);
        }
    }
