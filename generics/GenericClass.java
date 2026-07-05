// GenericClass.java
// Demonstrates a generic class.

class Box<T> {

    private T value;

    public void setValue(T value) {

        this.value = value;
    }

    public T getValue() {

        return value;
    }
}

public class GenericClass {

    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setValue("Java");

        System.out.println(box.getValue());
    }
}

/*
==========================================
Explanation

Generics

Allow classes to work with
different data types.

T represents Type.

==========================================
*/