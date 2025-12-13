package Java_008_Loops.Ex_01_ForLoop;

import java.util.Scanner;

public class Lab087_AP2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        //3,7,11,15,19,23...

        // this is good code as compare to earlier
        int a =3, d =4;
        for (int i = 1; i<=n; i++){
            System.out.print(a+ " ");
            a += d;
        }
        sc.close();





    }
}
