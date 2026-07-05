// SingleInheritanceDemo.java

public class SingleInheritanceDemo {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.eat();
        dog.sleep();
        dog.bark();
    }
}

/*
==========================================
Single Inheritance

Animal
   ↓
 Dog

Dog inherits Animal.

==========================================
*/