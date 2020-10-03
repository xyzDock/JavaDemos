package com.phyleet.serializationDemos;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeEmployee {
    public static void main(String[] args) throws FileNotFoundException {
        Employee e = new Employee();
        e.name = "Reyan Ali";
        e.address = "Phokka Kuan, Ambehta Peer";
        e.SSN = 11122333;
        e.number = 101;
        FileOutputStream fileOut = new FileOutputStream("JavaSeDemos/src/main/resources/outPut/Employee.ser");
        try {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            fileOut.close();
            System.out.println("Serialized data is saved in outPut/Employee.ser");
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
