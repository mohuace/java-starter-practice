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

            //Convert an object into a byte stream so that it can be sent across a network
            //This is called serialization.
            FileOutputStream foos = new FileOutputStream("file_object.txt");
            //Object os will only do the conversion of object into a byte stream,
            //but it will further require some OutputStream obj that will actually
            //perform the write to the destination (network stream, file output stream, byte array output stream, etc).
            ObjectOutputStream oos = new ObjectOutputStream(foos);

            String s1 = "this is an object that is going to be written into a text file";
            int i = 10;

            oos.writeInt(i);
            oos.writeObject(s1);

            //Now you have written both the objects into the file
            //How to access it?

            //6. ObjectInputStream
            FileInputStream fios = new FileInputStream("file_object.txt");
            //Object input stream will use the underlying input stream and deserialize
            //them into objects, this way the state of the object is preserved.
            ObjectInputStream ois = new ObjectInputStream(fios);

            System.out.println("The integer is "+ois.readInt());
            System.out.println(ois.readObject());

            //Note, need to read (deserialize) in the same sequence as it was written.
            //If you wrote int first, you cannot deserialize object, it will give error

            ois.close();
            oos.close();

            //7. BufferedInputStream
            FileInputStream fis1 = new FileInputStream("some_large_file.txt");
            //It will read chunks of data and store in the buffered input stream.
            //But this statement will only initialize the buffer
            BufferedInputStream bis = new BufferedInputStream(fis1, 1024);

            //This will read chunk of data from the memory and store it in the internal buffer
            //Subsequent read calls will then be reading from the buffer rather than going to the disk
            //to fetch data each time.
            //bis.read();

            byte[] inBuffArr = new byte[bis.available()];

            bis.read(inBuffArr);

            System.out.println(new String(inBuffArr));





            //8. BufferedOutputStream
            FileOutputStream fos_buff = new FileOutputStream("file_buff.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos_buff, 100);

            String data = "hey there, this is not a large text file and it is even smaller than the buffer size";

            //The buffer size is much big, so what buffered output stream does is, it will take chunks of data
            //and load them into the buffer, it won't immediately write to the disk...for that u can use flush().
            //It will only write to the disk once the buffer is full, or the buffered output stream is close.
            //WHen u don't have anything mentioned, it wont write if the buffered is not full yet.
            bos.write(data.getBytes());

            //This becomes important because if buffer size is larger than the data, then in that case the
            //data wont be written from the buffer to the disk.
            bos.close();


        }
        catch(IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e1) {
            throw new RuntimeException(e1);
        }


    }
}
