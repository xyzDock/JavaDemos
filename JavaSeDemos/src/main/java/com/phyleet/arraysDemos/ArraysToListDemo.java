package com.phyleet.arraysDemos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class ArraysToListDemo {
    public static void main(String[] args) {
        //Arrays.asList 是泛型方法, 传入的对象必须是对象数组.
        String[] arr = {"hello", "world", "spring", "redis"};

        /**
         * 此处返回的lst实际上不是 java.util.ArrayList, 而是定义在 java.util.Arrays中的一个私有静态类,
         * 是由原始数组支持的固定大小的列表,
         * 这种情况下对lst进行增删会报错.
         **/
        List<String> lst = Arrays.asList(arr);
        // lst.add("kafka");

        /**
         * 所以最好是用下边这种方式进行转换.
         */
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add("kafka");

        System.out.println(lst);
        System.out.println(list);

        //基本类型也可以实现转换(以来boxed的装箱操作)
        int[] arrs = {1, 2, 3};
        List<Integer> myList = Arrays.stream(arrs).boxed().collect(Collectors.toList());
        myList.add(4);
        System.out.println(myList);

        List<String> lst2 = new CopyOnWriteArrayList<>(arr);
        lst2.add("copyOnWrite");
        System.out.println(lst2);
    }
}
