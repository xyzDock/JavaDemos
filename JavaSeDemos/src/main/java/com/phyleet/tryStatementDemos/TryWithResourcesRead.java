package com.phyleet.tryStatementDemos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesRead {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("JavaSeDemos/src/main/resources/inPut/scanRead.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
