package org.mohit.filehandling;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MyByteArrayOutputStream {
    public static void main(String[] args) {

        try {
            //Here the destination is array of bytes

            String data = "this is the data need to be output";

            ByteArrayOutputStream os  = new ByteArrayOutputStream(data.getBytes().length);

            byte[] outputData = data.getBytes();

            //This will take the byte array data and write to the output stream.
            os.write(outputData);

            //Accessing data from output stream
            String osData = os.toString();

            //OR accessing the byte array from the output stream
            byte[] osByteArr = os.toByteArray();

            System.out.println(osData);

            os.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
