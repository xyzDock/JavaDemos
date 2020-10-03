package com.phyleet.tryStatementDemos;

import java.io.*;

public class ReadAndWriteOut {
    public static void main(String[] args) {
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(new File("JavaSeDemos/src/main/resources/inPut/scanRead.txt")));
             BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream(new File("JavaSeDemos/src/main/resources/outPut/writeOut.txt")))) {
            int b;
            while ((b = bin.read()) != -1) {
                bout.write(b);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
