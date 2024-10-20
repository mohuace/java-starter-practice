package org.mohit.filehandling;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MyByteArrayInputStream {
    public static void main(String[] args) {

        //Here, the source will be array of bytes, instead of an input file.
        //Array of bytes will be loaded into the input stream

        String data = "This is the input data";

        byte[] inputData = data.getBytes();

        try {
            //The byte array data is loaded into the input stream.
            InputStream is = new ByteArrayInputStream(inputData);

            System.out.println("The input stream is ");

//            for(int i = 0 ; i < inputData.length ; i++) {
//
//                System.out.print(is.read() + " ");
//            }

            System.out.println();

            //It reads all the bytes together and then will return an empty []
            //because there is nothing else left to read (the above for loop has read the entire input stream and hence
            //nothing is left to read
            String dataFromIs = new String(is.readAllBytes());

            System.out.println("In string it is "+dataFromIs);

            //This will print 0
            System.out.println(is.available());

            is.close();

        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}
