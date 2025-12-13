package Java_008_Loops.Ex_01_ForLoop;

import java.util.Scanner;

public class Lab088_GP {
    //Q: Display this GP- 1,2,4,8,16,32... up to 'n'
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        int a = 1, r = 2;
        for (int i = 1; i <= n; i++){
            System.out.print(a + " ");
            a *=r;
        }
        sc.close();

    }



}
