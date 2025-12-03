package Java_004_Operators.ex2_PracticalsProgram;

import java.util.Scanner;

public class Lab028_EvenOrOdd {
    public static void main(String[] args) {
        // Check if a number is even or odd Using % operator.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if (number%2==0){
            System.out.println(number +" is Even Number");
        }
        else {
            System.out.println(number+" is Odd Number");
        }
    }
}
