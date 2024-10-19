package org.mohit.filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyFileOutputStream {
    public static void main(String[] args) {

        //Output Stream will get data from the program and load it in the destination
        String data = "This is the data we want to load in output stream destination";

        try {
            //Here, since we are using file output stream, the destination would be a file.
            OutputStream os = new FileOutputStream("output.txt");

            //Since we want to load data in the form of byte[], we will convert our string to byte array
            byte[] byteData = data.getBytes();

            //We are writing the byte array into the output stream, which will load into the output file (destination)
            //TODO: ASK how does it know to convert the byte array into a string in the text file?
            //ANS - The output stream doesnt do this, it directly write the byte[] in the file,
            //the file editor interprets the byte[] and converts into valid characters inside the file.
            os.write(byteData);

            //Not useful here..the write method for FileOutputStream, loads in the output stream and immediately
            //writes the data into the destination (file). But, there is another type called BufferedOutputStream
            //Here, the output stream stores data in a temporary buffer and then once the buffer is full, it writes
            //the data into the actual destination. flush() does not wait for buffer to get full and immediately writes into the destination.
            //os.flush();


            os.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
