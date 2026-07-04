// Output Methods in Java
// Java provides different methods to display output on the console.

public class OutputMethods {

    public static void main(String[] args) {

        System.out.println("Using println()");
        System.out.println("Each statement is printed on a new line.");

        System.out.print("\nUsing print()");
        System.out.print(" This continues on the same line.");

        System.out.printf("\n\nName: %s\n", "Simran");
        System.out.printf("Age: %d\n", 20);
        System.out.printf("CGPA: %.2f\n", 9.15);
    }
}

/*
==========================================
Explanation

print()
- Prints output without moving to the next line.

println()
- Prints output and moves to the next line.

printf()
- Prints formatted output.

Common Format Specifiers

%s -> String
%d -> Integer
%f -> Decimal Number
%c -> Character
%b -> Boolean

==========================================
*/