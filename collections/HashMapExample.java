// HashMapExample.java
// Demonstrates the use of HashMap.

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Simran");
        students.put(102, "Rahul");
        students.put(103, "Aman");

        System.out.println(students);

        System.out.println("Student 101 : " + students.get(101));

        students.remove(102);

        System.out.println(students);
    }
}

/*
==========================================
Explanation

HashMap

Stores data as

Key → Value

Features

• Unique Keys
• Duplicate Values Allowed
• Fast Searching

Common Methods

put()
get()
remove()

==========================================
*/