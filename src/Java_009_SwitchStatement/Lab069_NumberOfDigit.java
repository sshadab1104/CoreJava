package Java_009_SwitchStatement;

import java.util.Scanner;

public class Lab069_NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number");
        int num = sc.nextInt();
        switch (String.valueOf(num).length()){
            case 1:
                System.out.println("1 Digit"); break;
            case 2:
                System.out.println("2 Digit"); break;
            case 3:
                System.out.println("3 Digit"); break;
            default:
                System.out.println("More than 3 digit");
        }

    }
}
