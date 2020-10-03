package com.phyleet.serializationDemos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeEmployee {
    public static void main(String[] args) {
        Employee e = null;
        FileInputStream fileIn = null;
        try {
            fileIn = new FileInputStream("JavaSeDemos/src/main/resources/outPut/Employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            e = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        }
        System.out.println("DeSerializing Employee...");
        System.out.println("Name --> " + e.name);
        System.out.println("Address --> " + e.address);
        System.out.println("SSN --> " + e.SSN);
        System.out.println("Number --> " + e.number);
    }
}
