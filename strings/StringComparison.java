// String Comparison in Java
// Strings can be compared using equals() and equalsIgnoreCase().

public class StringComparison {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";

        System.out.println("equals()");

        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));

        System.out.println("\nequalsIgnoreCase()");

        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println("\ncompareTo()");

        System.out.println(str1.compareTo(str2));
    }
}

/*
==========================================
Explanation

equals()
Compares the content of two strings.

equalsIgnoreCase()
Ignores letter case while comparing.

compareTo()
Compares two strings alphabetically.

==========================================
*/