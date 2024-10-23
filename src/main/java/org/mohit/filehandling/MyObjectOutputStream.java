package org.mohit.filehandling;

import java.io.*;

public class MyObjectOutputStream {
    public static void main(String[] args) {
        //ObjectOutputStream is used to convert an object into a stream
        //This is called Serialization (refer ipad notes)
        //Will only work for objects that implement the serializable interface

        try {

            int data1 = 55;
            String data2 = "data to be written using Object output stream";

            FileOutputStream fileOs = new FileOutputStream("file_output_obj.txt");

            //This object output stream will write to the specified output stream (in this case file)
            //Object output stream only does the conversion of java objects into stream.
            //It doesn't handle the low level details of performing the actual writing into the destination.
            //The OutputStream can be any subclass that handles byte-level output, such as FileOutputStream (for writing to files),
            //ByteArrayOutputStream (for writing to memory), or SocketOutputStream (for network communication).
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOs);

            //Converting to stream that will write to the file
            objectOutputStream.writeInt(data1);
            objectOutputStream.writeObject(data2);

            //Now I will use ObjectInputStream and FileInputStream to fetch and deserialize data
            FileInputStream fileIs = new FileInputStream("file_output_obj.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileIs);
            System.out.println("The integer is = "+objectInputStream.readInt());
            System.out.println("The object is = "+(String) objectInputStream.readObject());

            objectOutputStream.close();
            objectInputStream.close();



            //For Custom Objects
            Dog dog1 = new Dog("Millie", "Golden retriever");
            FileOutputStream file_os = new FileOutputStream("dog_obj_stream.txt");
            ObjectOutputStream obj_os = new ObjectOutputStream(file_os);

            //This will convert to stream of data and then write to the file
            obj_os.writeObject(dog1);

            //The file input stream will be used to get the input stream of the object
            //ObjectInputStream will do the deserialization of the stream to object.
            FileInputStream file_is = new FileInputStream("dog_obj_stream.txt");
            ObjectInputStream obj_is = new ObjectInputStream(file_is);

            System.out.println(obj_is.readObject());

            obj_os.close();
            obj_is.close();




        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
