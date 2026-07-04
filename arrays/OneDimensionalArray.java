// One-Dimensional Array in Java
// A one-dimensional array stores multiple values of the same data type.

public class OneDimensionalArray {

    public static void main(String[] args) {

        int[] marks = {85, 90, 78, 92, 88};

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Marks[" + i + "] = " + marks[i]);
        }
    }
}

/*
==========================================
Explanation

One-Dimensional Array

Syntax

dataType[] arrayName = {value1, value2, ...};

marks.length returns the total number of elements.

==========================================
*/