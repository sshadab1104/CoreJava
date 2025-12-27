package Java_013_Arrays;

import java.util.Scanner;

public class Lab_104_CalculateSumOfArray {
    public static void main(String[] args) {
        //Q. Calculate the sum of all the elements in the given array.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        System.out.println("Enter Array Elements:");
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
