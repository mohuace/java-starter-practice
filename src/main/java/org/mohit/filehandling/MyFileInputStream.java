package org.mohit.filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyFileInputStream {
    public static void main(String[] args) {
        //Stream represents sequence of data.
        //Can be of two types, character stream and byte stream
        //InputStream and OutputStream in Java are abstract classes that read and write files using byte streams.

        try {
            //Read text file and store it in the input stream (text file is the source), input stream is the program
            InputStream input = new FileInputStream("sample.txt");

            System.out.println(input.available());

            //Defining byte array of length equal to available input stream size, this is because input stream size
            //will give us the size of the byte array that we should keep
            byte[] dataArr = new byte[input.available()];

            //THis reads byte by byte from the input stream and stores it in the byte array that we defined,
            //Hence we kept byte array size as the size of the input stream
            input.read(dataArr);

            //Converting byte array to string.
            String data = new String(dataArr);

            System.out.println(data);

            input.close();



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
