package Java_013_Arrays;

import java.util.Scanner;

public class Lab_105_LinearSearch {
    public static void main(String[] args) {
        // find the element 'x' in the array take array and x as input.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array size:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the Array Elements:");
        for (int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the X element");
        int x = sc.nextInt();
        boolean flag = false;

        for (int i = 0; i<arr.length; i++){
            if(arr[i]==x) {
                flag = true;
                break;
                }
            }
            if (flag==false){
                System.out.println(x+ " Not found in the array");
            }
            else {
                System.out.println(x+" Fount in the array");
            }
            sc.close();
    }
}
