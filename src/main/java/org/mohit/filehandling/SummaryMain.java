package org.mohit.filehandling;

import java.io.*;

public class SummaryMain {
    public static void main(String[] args) {

        //This is for revision
        try {
            //1. FileInputStream

            //The text file is taken as input stream (sequence of data)...from source to program
            //Doesn't do actual reading, but will take meta data such as total file size to estimate
            //how many bytes are to be read using available() method.
            FileInputStream fileIs = new FileInputStream("TestInput.txt");

            byte[] inputData = new byte[fileIs.available()];

            //Reads the text file one byte at a time, and stores in the byte array provided
            fileIs.read(inputData);

            String actualData = new String(inputData);

            System.out.println(actualData);

            fileIs.close();


            //2.FileOutputStream

            FileOutputStream fileOs = new FileOutputStream("TestOutput.txt");

            String opData = "Data to be written in the file";

            byte[] dataBytes = opData.getBytes();

            //Need to write into the destination one byte at a time
            fileOs.write(dataBytes);

            //The file system (txt) will automatically take those bytes and convert into characters

            fileOs.close();

            //3. ByteArrayInputStream

            String baisInputData = "This is the input data for byte array input stream";
            //The purpose of reading some byte[] data and putting this into input stream
            //is to make it accessible from anywhere, can read easily using read function,
            //many other apis and libraries that accept only input stream can use it.
            ByteArrayInputStream bais = new ByteArrayInputStream(baisInputData.getBytes());

            byte[] inputByteArr = new byte[bais.available()];

            //Reading byte array input stream and storing it inside a byte array
            bais.read(inputByteArr);

            System.out.println(new String(inputByteArr));

            bais.close();



            //4. ByteArrayOutputStream

            String byteArrData = "Data to be written inside byte array os";

            byte[] byteArrOSData = byteArrData.getBytes();

            //Need to define what the length of the byte array will be where u will write the data
            ByteArrayOutputStream baos = new ByteArrayOutputStream(byteArrOSData.length);

            baos.write(byteArrOSData);

            //Accessing the output stream
            System.out.println(baos.toString());

            //OR can access the byte array
            byte[] outputByteArr = baos.toByteArray();

            baos.close();

            //5. ObjectOutputStream
            //6. ObjectInputStream
            //7. BufferedInputStream
            //8. BufferedOutputStream
        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }


    }
}
