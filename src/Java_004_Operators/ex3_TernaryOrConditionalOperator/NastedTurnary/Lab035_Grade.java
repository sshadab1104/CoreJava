package Java_004_Operators.ex3_TernaryOrConditionalOperator.NastedTurnary;

import java.util.Scanner;

public class Lab035_Grade {
    public static void main(String[] args) {
        // result = (condition1 ? expression1 : (condition2? expression2 : expression3);
        // Score >= 90 grade is "A"
        // Score >= 80 grade is "B"
        // Score >= 70 grade is "C"
        // Score >= 60 grade is "D"
        // Score < 60 grade is "F"
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Score:");
        int score = sc.nextInt();
        String grade = (score>=90)? "A" : (score>=80)? "B" : (score>=70)? "C" : (score>=60) ? "D": "F";
        System.out.println("Your Grade is "+grade);
    }
}
