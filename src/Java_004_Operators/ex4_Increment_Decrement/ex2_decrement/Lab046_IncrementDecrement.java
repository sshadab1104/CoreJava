package Java_004_Operators.ex4_Increment_Decrement.ex2_decrement;

public class Lab046_IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a + a++ + --a);
        System.out.println(a);

        // A-> --a = 9, a-> 9
        // B-> a++ = 9, a-> 10
        // C-> --a = 9, a-> 9
    }
}
