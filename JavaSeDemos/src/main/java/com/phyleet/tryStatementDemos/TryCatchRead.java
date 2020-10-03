package com.phyleet.tryStatementDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryCatchRead {
    public static void main(String[] args) {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("JavaSeDemos/src/main/resources/inPut/scanRead.txt"));
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }

    }
}
