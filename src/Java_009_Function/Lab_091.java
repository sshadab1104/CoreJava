package Java_009_Function;

import java.util.Scanner;

public class Lab_091 {
    public static void main(String[] args) {
        // Create a Function of Sub, Sum, Mul and Div with parameter, a, b
        // (take the parameter from the User)
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number ");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number ");
        int b = sc.nextInt();
        // sum of 2 number
        int result_sum = sum_of_number(a, b);
        System.out.println("Sum is -> "+result_sum);

        // Sub of 2 number
        int result_sub = sub_of_number(a, b);
        System.out.println("Sub is -> "+result_sub);

        // Mul of 2 number
        int result_mul = mul_of_number(a, b);
        System.out.println("Multiplication is-> "+result_mul);

        // Div of 2 number
        int result_div = div_of_number(a, b);
        System.out.println("Division is-> "+result_div);

    }

     static int div_of_number(int a, int b) {
        return a / b;
    }

    static int mul_of_number(int a, int b) {
        return a * b;
    }

    static int sub_of_number(int a, int b) {
        return a - b;
    }

    static int sum_of_number(int a, int b) {
        return a + b;
    }


}