package Java_009_SwitchStatement;

import java.util.Scanner;

public class Lab068_VowelOrConstant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");

        char ch = sc.next().charAt(0);
        char lower = Character.toLowerCase(ch);

        switch (lower){
            case 'a': case 'e': case 'i': case 'o': case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Constant");
        }
    }
}
