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
            os.write(byteData);


            os.close();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
