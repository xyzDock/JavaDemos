package com.phyleet.loopDemos;

public class TagDemo {
    public static void main(String[] args) {
        //用带有标签的break跳出指定的循环, continue同理
        loop1:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == 2) {
                    break loop1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
