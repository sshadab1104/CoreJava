package Java_005_TakingInput;

import java.util.Scanner;

public class Lab048_Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = sc.nextInt();
        System.out.println(age >= 18 ? "Allowed to drive" : "Not Allowed");
    }

}
