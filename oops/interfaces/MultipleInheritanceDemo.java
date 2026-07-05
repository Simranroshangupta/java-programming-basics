// MultipleInheritanceDemo.java
// Java supports multiple inheritance using interfaces.

interface Camera {

    void takePhoto();
}

interface MusicPlayer {

    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {

        System.out.println("Photo Captured.");
    }

    @Override
    public void playMusic() {

        System.out.println("Playing Music.");
    }
}

public class MultipleInheritanceDemo {

    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        phone.takePhoto();
        phone.playMusic();
    }
}

/*
==========================================
Explanation

Java does NOT support multiple
inheritance using classes.

It DOES support multiple inheritance
using interfaces.

Example

interface A
interface B

class C implements A, B

==========================================
*/