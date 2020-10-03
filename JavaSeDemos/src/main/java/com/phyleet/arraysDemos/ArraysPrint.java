package com.phyleet.arraysDemos;

public class ArraysPrint {
    public static <E> void printArrays(E[] arrays) {
        for (E element : arrays) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
