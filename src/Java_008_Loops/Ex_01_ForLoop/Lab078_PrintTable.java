package Java_008_Loops.Ex_01_ForLoop;

import java.util.Scanner;

public class Lab078_PrintTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of table which you want:");
        int num = sc.nextInt();
                for (int i = 1; i<=10; i++){
                    System.out.println(num + "x" + i + "=" + num*i);
        }
    }
}
