package Java_008_Loops.Ex_01_ForLoop;

import java.util.Scanner;

public class Lab079_FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int fac = 1;
        for (int i = 1; i<=n; i++){
            fac *= i ;
        }
        System.out.println(fac);
    }
}
