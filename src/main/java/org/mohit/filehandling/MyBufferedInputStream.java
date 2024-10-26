package org.mohit.filehandling;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;

public class MyBufferedInputStream {
    public static void main(String[] args) {
        //BufferedInputStream will read chunk of bytes from a source (disk),
        //and it will store it in an internal buffer.
        //And then when read operation is performed, it read from this buffer
        //so that it is efficient (faster).
        //Normal fileinputstream reads one byte at a time from the disk and it can cause
        //the operation to slow down for large files.
        //For BufferedInputStream, the number of communication to the disk is reduced.

        try {
            FileInputStream fis = new FileInputStream("SampleTextFile_Large.txt");
            byte[] largeInput = new byte[fis.available()];

            //Performing read operation (reading from disk and writing into byte array)
            Instant startFIS = Instant.now();
            fis.read(largeInput);
            Instant endFIS = Instant.now();

            Duration durationFIS = Duration.between(startFIS, endFIS);

            // Print the execution time in milliseconds
            System.out.println("Execution time for FileInputStream: " + durationFIS.toMillis() + " milliseconds");

//            String str = new String(largeInput);
//            System.out.println(str);


            //Using bufferedInputStream
            //The second argument is the size
            //This is quicker
            FileInputStream fis1 = new FileInputStream("SampleTextFile_Large.txt");
            BufferedInputStream bis = new BufferedInputStream(fis1, 1024 * 10);
            byte[] bufferedInputByteArray = new byte[fis1.available()];
            Instant startBIS = Instant.now();
            bis.read(bufferedInputByteArray);
            Instant endBIS = Instant.now();

            // Calculate the duration
            Duration durationBIS = Duration.between(startBIS, endBIS);

            // Print the execution time in milliseconds
            System.out.println("Execution time for BufferedInputStream: " + durationBIS.toMillis() + " milliseconds");

            //String str1 = new String(bufferedInputByteArray);

            //System.out.println(str1);

        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
