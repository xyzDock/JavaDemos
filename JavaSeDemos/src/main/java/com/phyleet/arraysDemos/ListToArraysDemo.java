package com.phyleet.arraysDemos;

import java.util.ArrayList;
import java.util.List;

public class ListToArraysDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);

        //方法 1: 注意此处类型为 Object.
        Object[] arrays1 = list.toArray();

        //new String[0]就是起一个模板的作用，指定了返回数组的类型，0是为了节省空间，因为它只是为了说明返回的类型。
        String[] arrays12 = list.toArray(new String[0]);

        //方法 2:
        String[] arrays2 = list.toArray(new String[list.size()]);

        System.out.println("arrays1 --> ");
        ArraysPrint.printArrays(arrays1);

        System.out.println("arrays12 --> ");
        ArraysPrint.printArrays(arrays12);

        System.out.println("arrays2 --> ");
        ArraysPrint.printArrays(arrays2);
    }
}
