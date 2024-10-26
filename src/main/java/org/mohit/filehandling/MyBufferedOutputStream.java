package org.mohit.filehandling;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyBufferedOutputStream {
    public static void main(String[] args) {
        //BufferedOutputStream
        //The bytes are first written into an internal buffer,
        //once the buffer is filled, then the entire chunk of bytes is written into the disk
        //This is efficient and reduces the number of writes to the disk which is expensive.

        try {
            String data = "this is the data to be written";
            FileOutputStream fos = new FileOutputStream("buffered_output.txt");

            BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);

            byte[] dataBytes = data.getBytes();

            //The string data (in bytes) is written into a buffer first, 1024 KB at a time
            //Then once the buffer is full, the entire data is written into the disk or the
            //file in this case buffered_output.txt
            bos.write(dataBytes);

            //VERY IMPORTANT
            //If the buffer is not filled, then the data won't be written into the disk
            //Till the buffered os is closed, it only writes into the disk if the buffer
            //is full or the BOS is closed.
            bos.close();
            fos.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }


    }
}
