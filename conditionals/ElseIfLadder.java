// Else-If Ladder in Java
// Used to check multiple conditions one after another.

public class ElseIfLadder {

    public static void main(String[] args) {

        int marks = 82;

        System.out.println("Marks : " + marks);

        if (marks >= 90) {
            System.out.println("Grade : A+");
        } else if (marks >= 80) {
            System.out.println("Grade : A");
        } else if (marks >= 70) {
            System.out.println("Grade : B");
        } else if (marks >= 60) {
            System.out.println("Grade : C");
        } else if (marks >= 40) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }
    }
}

/*
==========================================
Explanation

Else-If Ladder

- Used when multiple conditions need to be checked.
- Only the first true condition is executed.

==========================================
*/