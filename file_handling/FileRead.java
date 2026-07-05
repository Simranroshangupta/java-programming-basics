// FileRead.java
// Reads data from a file.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileRead {

    public static void main(String[] args) {

        try {

            File file = new File("student.txt");

            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {

                System.out.println(scanner.nextLine());
            }

            scanner.close();

        } catch (FileNotFoundException exception) {

            System.out.println(exception.getMessage());
        }
    }
}

/*
==========================================
Explanation

Scanner

Reads data from a file.

hasNextLine()

Checks whether another line exists.

nextLine()

Reads one line.

==========================================
*/