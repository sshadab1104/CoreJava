package Java_006_IfCondition;

import java.util.Scanner;

public class Lab055_interviewQue4 {
    public static void main(String[] args) {
        // Create a Program - Take User Input.
        // Check weather the input is even or odd number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println(num +" is Even number");
        }
        else {
            System.out.println(num + " is Odd number");
        }
        sc.close();
    }
}
