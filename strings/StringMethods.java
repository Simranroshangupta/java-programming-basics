// String Methods in Java
// String provides many built-in methods to manipulate text.

public class StringMethods {

    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println("Original String : " + text);

        System.out.println("Length          : " + text.length());

        System.out.println("Uppercase       : " + text.toUpperCase());

        System.out.println("Lowercase       : " + text.toLowerCase());

        System.out.println("Character at 5  : " + text.charAt(5));

        System.out.println("Substring       : " + text.substring(5));

        System.out.println("Contains 'Java' : " + text.contains("Java"));

        System.out.println("Replace         : " + text.replace("Java", "Python"));
    }
}

/*
==========================================
Explanation

Common String Methods

length()
toUpperCase()
toLowerCase()
charAt()
substring()
contains()
replace()

==========================================
*/