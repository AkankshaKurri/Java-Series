//1. FileWriter is used for writing streams of characters to files.
//2. It's a character-based stream, which means it's best used for rwriting text rather than binary data.
//3. Constructors:
//    -> FileWriter(String fileName): Creates a FileWriter object given the name of the file to write to.
//    -> FileWriter(File file): Creates a FileWriter object given a File object.
//4. Common Methods:
//   -> write(int c): Writes a single character.
//   -> write(char[] cbuf): Writes an array of characters.
//   -> write(String str): Writes a string.
//   -> flush(): Flushes the stream, ensuring all data is written out.
//   -> close(): Closes the stream, releasing any associates system.

//Object parent -> Writer
//Writer parent -> OutputStreamFileWriter parent
//OutputStreamFileWriter parent -> FileWriter

//flush() ka matlab hai:
//"Jo data temporarily memory (buffer) mein rakha gaya hai, usse turant file mein likh do."

//Why flush() is needed?
//When you write data using FileWriter, Java internally stores that data temporarily in a buffer (a small memory storage). This is done to improve performance, so Java doesn’t write to the file every time you write a few characters.
//But sometimes, the buffer is not written to the file immediately.
//To force Java to immediately write the data from buffer to the file, we use:
//writer.flush();


package in.kgcoding.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName= "java_course.txt";
        /*
         * Try-with-resources block: It automatically closes the FileWriter resource
         * after the try block is executed. This ensures proper resource management.
         */
        try (FileWriter writer = new FileWriter(fileName)) {

            // Writing text content into the file
            writer.write("This is the best java course.");

            // Optional: Forces any buffered output to be written to the file
            writer.flush();

            // Printing success message after writing is complete
            System.out.println("Successfully written to the file");

            // Catch block handles any IOExceptions that may occur while writing
        } catch (IOException exception) {

            // Printing the exception message to the console
            System.out.println(exception.getMessage());
        }
    }
}
