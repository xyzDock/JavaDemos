package com.phyleet.genericsDemos;

public class GenericMethodDemo {
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        printArray(intArray);
        printArray(stringArray);
    }
}
