// LinkedListExample.java
// Demonstrates the use of LinkedList.

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Pune");

        System.out.println(cities);

        cities.addFirst("Jaipur");

        cities.addLast("Bangalore");

        System.out.println(cities);

        cities.removeFirst();

        System.out.println(cities);
    }
}

/*
==========================================
Explanation

LinkedList

• Dynamic List
• Fast insertion/deletion
• Maintains insertion order

Useful Methods

addFirst()
addLast()
removeFirst()

==========================================
*/