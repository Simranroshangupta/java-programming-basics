// Two-Dimensional Array in Java
// A two-dimensional array stores data in rows and columns.

public class TwoDimensionalArray {

    public static void main(String[] args) {

        int[][] marks = {
                {85, 90, 88},
                {78, 82, 80},
                {92, 95, 91}
        };

        System.out.println("Student Marks:");

        for (int i = 0; i < marks.length; i++) {

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}

/*
==========================================
Explanation

Two-Dimensional Array

Stores data in the form of rows and columns.

Syntax

dataType[][] arrayName;

==========================================
*/