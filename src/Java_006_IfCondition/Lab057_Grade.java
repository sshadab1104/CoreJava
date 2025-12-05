package Java_006_IfCondition;

import java.util.Scanner;

public class Lab057_Grade {
    public static void main(String[] args) {
        //Q. Write a  Program that calculate and displays the latter grade
        // for the given numerical score (e.g., A,B,C,D,F)
        //Based on the following grading scale:

        // A: 90 - 100
        // B: 80 - 89
        // C: 70 - 79
        // D: 60 - 69
        // F: 0 - 59
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the score:");
        int score = sc.nextInt();
        char grade = 'F';
        if (score >= 90 && score <=100){
            grade = 'A';
        } else if (score >= 80 && score <=89) {
            grade = 'B';
        } else if (score >= 70 && score <=79) {
            grade = 'C';
        }
        else if (score >= 60 && score <=69) {
            grade = 'D';
        } else if (score <=0 || score >100) {
            System.out.println("LOL!! are  you GOD?");
            grade = 'O';
        } else {
            grade = 'F';
        }
        System.out.println(" Your grade id -> "+ grade);
    }
}
