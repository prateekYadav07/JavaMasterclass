package com.masterclass.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        * Linkedlist implements List as well as Deque interfaces
         */
        List<String> placesToVisit = new LinkedList<>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Canberra");
        System.out.println(placesToVisit);
    }

    public static void addMoreElements(LinkedList<String> list){
        // linked list methods
        list.addFirst("Darwin");
        list.addLast("Hobart");

        // Queue methods

    }
}
