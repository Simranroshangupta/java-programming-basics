// HashSetExample.java
// Demonstrates the use of HashSet.

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> languages = new HashSet<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("Java");

        System.out.println(languages);

        System.out.println("Contains Java : " + languages.contains("Java"));

        languages.remove("Python");

        System.out.println(languages);
    }
}

/*
==========================================
Explanation

HashSet

• Stores unique elements
• Does not maintain insertion order
• No duplicate values

==========================================
*/