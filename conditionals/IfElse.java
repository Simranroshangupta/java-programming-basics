// If-Else Statement in Java
// The if-else statement executes one block if the condition is true,
// otherwise it executes the else block.

public class IfElse {

    public static void main(String[] args) {

        int marks = 35;

        System.out.println("Marks : " + marks);

        if (marks >= 40) {
            System.out.println("Result : Pass");
        } else {
            System.out.println("Result : Fail");
        }
    }
}

/*
==========================================
Explanation

if-else Statement

Syntax

if(condition)
{
    // Executes when condition is true
}
else
{
    // Executes when condition is false
}

Only one block is executed.

==========================================
*/