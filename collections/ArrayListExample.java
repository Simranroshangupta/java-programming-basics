// ArrayListExample.java
// Demonstrates the use of ArrayList.

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Simran");
        students.add("Rahul");
        students.add("Aman");

        System.out.println("Students : " + students);

        students.remove("Rahul");

        System.out.println("After Removal : " + students);

        System.out.println("First Student : " + students.get(0));

        System.out.println("Total Students : " + students.size());
    }
}

/*
==========================================
Explanation

ArrayList

• Dynamic Array
• Maintains insertion order
• Allows duplicate elements
• Indexed Collection

Common Methods

add()
remove()
get()
size()

==========================================
*/