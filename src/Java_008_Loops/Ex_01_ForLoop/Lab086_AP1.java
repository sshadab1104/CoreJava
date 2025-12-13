package Java_008_Loops.Ex_01_ForLoop;

import java.util.Scanner;

public class Lab086_AP1 {
    public static void main(String[] args) {
        // 4 7 10 13
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for (int i = 4; i <= 3*n+1; i+=3){
            System.out.print(i+ " ");
        }
    }
}
