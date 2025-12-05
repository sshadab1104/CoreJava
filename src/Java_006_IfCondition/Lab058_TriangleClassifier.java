package Java_006_IfCondition;

import java.util.Scanner;

public class Lab058_TriangleClassifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first side of triangle");
        int side1 = sc.nextInt();
        System.out.println("Enter the second side of triangle");
        int side2 = sc.nextInt();
        System.out.println("Enter the third side of triangle");
        int side3 = sc.nextInt();
        if (side1 <=0 || side2<=0 || side3<=0){
            System.out.println("Invalid Input");
        }
        else if (side1 == side2 && side1 ==side3 && side2 == side3){
            System.out.println("Equilateral Triangle");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {
            System.out.println("Isosceles Triangle");
            }
        else {
            System.out.println("Scalene Triangle");
        }
    }
}
