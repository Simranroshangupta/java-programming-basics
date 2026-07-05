// Practical 07 (a)
// Program to demonstrate Hybrid Inheritance using Interface.

class Student {

    int rollNumber;

    void getRollNumber(int rollNumber) {

        this.rollNumber = rollNumber;
    }

    void displayRollNumber() {

        System.out.println("Roll Number : " + rollNumber);
    }
}

class Test extends Student {

    float subject1;
    float subject2;

    void getMarks(float subject1, float subject2) {

        this.subject1 = subject1;
        this.subject2 = subject2;
    }

    void displayMarks() {

        System.out.println("Subject 1 Marks : " + subject1);
        System.out.println("Subject 2 Marks : " + subject2);
    }
}

interface Sports {

    float sportsMarks = 6.0F;

    void displaySportsMarks();
}

class Result extends Test implements Sports {

    float total;

    @Override
    public void displaySportsMarks() {

        System.out.println("Sports Marks : " + sportsMarks);
    }

    void displayResult() {

        total = subject1 + subject2 + sportsMarks;

        displayRollNumber();

        displayMarks();

        displaySportsMarks();

        System.out.println("Total Marks : " + total);
    }
}

public class HybridInheritance {

    public static void main(String[] args) {

        Result student = new Result();

        student.getRollNumber(14);

        student.getMarks(35.5F, 40.0F);

        student.displayResult();
    }
}

/*
==========================================
Explanation

Hybrid Inheritance is achieved
in Java using interfaces.

Here,
Student → Test → Result

Result also implements the
Sports interface.

This combines inheritance and
interfaces together.

Time Complexity : O(1)
Space Complexity : O(1)

==========================================
*/