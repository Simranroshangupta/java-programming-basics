// MultilevelInheritanceDemo.java

public class MultilevelInheritanceDemo {

    public static void main(String[] args) {

        Puppy puppy = new Puppy();

        puppy.eat();
        puppy.sleep();
        puppy.bark();
        puppy.weep();
    }
}

/*
==========================================
Multilevel Inheritance

Animal
   ↓
 Dog
   ↓
Puppy

==========================================
*/