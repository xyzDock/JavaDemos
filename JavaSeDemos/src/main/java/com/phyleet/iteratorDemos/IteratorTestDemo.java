package com.phyleet.iteratorDemos;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorTestDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("abc", "def", "kml", "spring", "redis", "cloud"));
        System.out.println("列表: " + list);
        Iterator<String> iterator = list.iterator();
        // System.out.println(iterator.hasNext());
        // System.out.println(iterator.hasNext());
        // System.out.println(iterator.next());
        while (iterator.hasNext()) {
            if ("kml".equals(iterator.next())) {
                iterator.remove();
            }
        }
        System.out.println("列表2: " + list);
    }
}
