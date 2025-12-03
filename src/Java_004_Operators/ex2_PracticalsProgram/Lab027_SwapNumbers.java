package Java_004_Operators.ex2_PracticalsProgram;

public class Lab027_SwapNumbers {
    public static void main(String[] args) {
        // Swap two numbers without using a third variable.
        int a = 20, b = 10;
//        a = a-b;
//        b = a+b;
        a = a+b;
        b= a-b;
        a= a-b;
        System.out.println("a is "+ a);
        System.out.println("b is "+ b);

    }
}
