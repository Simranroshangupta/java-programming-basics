// Practical 10
// Program to write data to a file and read data from the same file.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {

    public static void main(String[] args) {

        try {

            // Writing data to the file
            FileWriter writer = new FileWriter("sample.txt");

            writer.write("Hello, this is a File Handling example in Java.\n");
            writer.write("Writing and Reading data from a file.");

            writer.close();

            System.out.println("Data written to file successfully.");

            System.out.println();

            // Reading data from the file
            FileReader reader = new FileReader("sample.txt");

            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;

            System.out.println("Reading Data From File:");

            while ((line = bufferedReader.readLine()) != null) {

                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException exception) {

            System.out.println("Error : " + exception.getMessage());
        }
    }
}

/*
==========================================
Explanation

File Handling is used to
store and retrieve data
from a file.

FileWriter writes data
to the file.

FileReader and
BufferedReader read
data from the file.

The try-catch block
handles any input or
output errors.

Time Complexity : O(n)
Space Complexity : O(1)

Expected Output

Data written to file successfully.

Reading Data From File:
Hello, this is a File Handling example in Java.
Writing and Reading data from a file.

==========================================
*/