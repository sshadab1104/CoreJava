package Java_010_String;

public class Lab_094_StringImmutable {
    public static void main(String[] args) {
        //In Java, a String is immutable, which means once a String object is created,
        // its value cannot be changed. Any modification results in the creation of a
        // new String object instead of changing the existing one.

        String s = "Hello";
        s.concat(" World");
        System.out.println(s);

        // Original String does not change
        // Correct Way:

        s = s.concat(" World");
        System.out.println(s);
    }
}
