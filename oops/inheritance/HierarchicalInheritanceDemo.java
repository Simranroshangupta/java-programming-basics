// HierarchicalInheritanceDemo.java

public class HierarchicalInheritanceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        Cat cat = new Cat();

        System.out.println("Dog");

        dog.eat();
        dog.bark();

        System.out.println();

        System.out.println("Cat");

        cat.eat();
        cat.meow();
    }
}

/*
==========================================
Hierarchical Inheritance

        Animal
       /      \
     Dog      Cat

Multiple child classes inherit
from one parent class.

==========================================
*/