package Java_009_SwitchStatement;

import java.util.Scanner;

public class Lab060_Switch_Day {
    public static void main(String[] args) {
        // User - Enter the number from 1 to 7.
        // Which day it is.
        // 1 - Mon, 4 - Thu, 7 - Sun , 8,9,10....-1 -> Invalid
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 to 7 ");
        int day = sc.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid number");
                break;

        }
        sc.close();
    }
}
