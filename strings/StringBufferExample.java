// StringBuffer in Java
// StringBuffer works like StringBuilder but is thread-safe.

public class StringBufferExample {

    public static void main(String[] args) {

        StringBuffer text = new StringBuffer("Java");

        text.append(" Programming");

        System.out.println("After append : " + text);

        text.insert(5, "Core ");

        System.out.println("After insert : " + text);

        text.replace(0, 4, "Advanced");

        System.out.println("After replace : " + text);

        text.delete(9, 14);

        System.out.println("After delete : " + text);

        text.reverse();

        System.out.println("After reverse : " + text);
    }
}

/*
==========================================
Explanation

StringBuffer

• Mutable
• Thread-safe
• Slower than StringBuilder

==========================================
*/