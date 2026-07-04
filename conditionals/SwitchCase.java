// Switch Case in Java
// Switch is used to select one block of code from multiple options.

public class SwitchCase {

    public static void main(String[] args) {

        int day = 3;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid Day");
        }
    }
}

/*
==========================================
Explanation

switch

- Used instead of multiple if-else statements.
- Executes the matching case.

break
- Stops execution after a matching case.

default
- Executes when no case matches.

==========================================
*/