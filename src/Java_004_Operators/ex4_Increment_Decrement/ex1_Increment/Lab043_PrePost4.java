package Java_004_Operators.ex4_Increment_Decrement.ex1_Increment;

public class Lab043_PrePost4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        // A -> ++a = 11, a -> 11
        // B -> a++ =  11 , -> 12
        // C -> a++ = 12, -> 13
    }
}
