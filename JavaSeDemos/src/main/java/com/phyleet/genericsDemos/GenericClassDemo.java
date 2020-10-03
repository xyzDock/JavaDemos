package com.phyleet.genericsDemos;

public class GenericClassDemo {
    public static void main(String[] args) {
        Generic1<String> generic1 = new Generic1<>("example1");
        System.out.println(generic1.getKey());
    }
}

class Generic1<T> {
    private T key;

    public Generic1(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}
