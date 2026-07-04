// StringBuilder in Java
// StringBuilder is used to modify strings efficiently.

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder text = new StringBuilder("Java");

        text.append(" Programming");

        System.out.println("After append : " + text);

        text.insert(5, "Core ");

        System.out.println("After insert : " + text);

        text.replace(0, 4, "Advanced");

        System.out.println("After replace : " + text);

        text.delete(9, 14);

        System.out.println("After delete : " + text);

        text.reverse();

        System.out.println("After reverse : " + text);
    }
}

/*
==========================================
Explanation

Common StringBuilder Methods

append()
insert()
replace()
delete()
reverse()

StringBuilder is mutable,
so its value can be changed.

==========================================
*/