//1. The FileReader class is used for reading streams of characters from files.
//2. It's a character-based stream, meaning it reads characters(as opposed to bytes). This makes it suitable for reading text files.
//3. Constructors:
//   ->FileReader(String fileName): Creates a fileReader object to read from a file with the specified name.
//   ->FileReader(Fi;e file): Creates a FileReader object to read from the specified file object.
//4. Common Methods:
//   -> read(): Reads a single character and returns it as an integer.
//              Returns -1 if the end of the stream is reached.
//   -> read(char[] cbuf): Reads characters into an array and returns the numbers of characters read.


package in.kgcoding.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        //the name of the file to be read
        String fileName = "java_course.txt";

        //Try-with-resources block to auto-close FileReader
        try (FileReader reader = new FileReader(fileName)) {
            //Variable to store each character read from file
            int read = 0;

            // Step 4: Loop to read each character until end of file (-1)
            while (read != -1) {
                // read() reads one character and returns its ASCII value
                read = reader.read();

                // Print the character only if not end-of-file
                if(read != -1) {
                    System.out.print((char) read); // Typecast int to char
                }
            }

            // Step 5: Catch block to handle file not found or read error
        } catch (IOException exception) {
            // Print the error message if an exception occurs
            System.out.println(exception.getMessage());
        }
    }
}