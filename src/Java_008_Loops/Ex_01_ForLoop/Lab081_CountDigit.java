package Java_008_Loops.Ex_01_ForLoop;

import java.util.Scanner;

public class Lab081_CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n = sc.nextInt();
        int count = 0;
        for (; n !=0; n=n/10){
            count++;
        }
        System.out.println(count);
    }
}
