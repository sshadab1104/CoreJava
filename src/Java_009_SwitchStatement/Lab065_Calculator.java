package Java_009_SwitchStatement;

import java.util.Scanner;

public class Lab065_Calculator {
    //Create a simple calculator that performs addition, subtraction, multiplication, and division, modus based on user input using switch statements.
    //
    //Inputs :   num 1, num 2, +
    //Output :  num1+num2 → print information.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the Mathematical symbol");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        switch (ch){
            case '+':
                System.out.println(a + b); break;
            case '-':
                System.out.println(a - b); break;
            case '*':
                System.out.println(a * b); break;
            case '/':
                System.out.println(a / b); break;
            case '%':
                System.out.println(a % b); break;
            default:
                System.out.println("Invalid Operator");
        }



    }
}
