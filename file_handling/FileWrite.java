// FileWrite.java
// Writes data into a file.

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("student.txt");

            writer.write("Welcome to Java File Handling.");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException exception) {

            System.out.println(exception.getMessage());
        }
    }
}

/*
==========================================
Explanation

FileWriter

Used to write data into a file.

Always close the file
after writing.

==========================================
*/