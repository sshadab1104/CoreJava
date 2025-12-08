package Java_009_SwitchStatement;

import java.util.Scanner;

public class Lab070_WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = sc.nextLine();
        int wordCount = sentence.split(" ").length;
        switch (wordCount){
            case 1:
                System.out.println("1 word"); break;
            case 2:
                System.out.println("2 words"); break;
            default:
                System.out.println(" More than 2 words"); break;
        }

    }
}
