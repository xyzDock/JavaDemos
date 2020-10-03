package com.phyleet.genericsDemos;

public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Generic4<String> generic4 = new Generic4<>();
        System.out.println(generic4.getGenericInfo2());
    }
}

interface Generic2<T> {
    public T getGenericInfo2();
}

class Generic3<T> implements Generic2<T> {
    @Override
    public T getGenericInfo2() {
        return null;
    }
}

class Generic4<T> implements Generic2<String> {
    @Override
    public String getGenericInfo2() {
        return "Hello.";
    }
}
