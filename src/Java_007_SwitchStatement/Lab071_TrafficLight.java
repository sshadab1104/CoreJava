package Java_007_SwitchStatement;

import java.util.Locale;
import java.util.Scanner;

public class Lab071_TrafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the signal colour");
        String signal = sc.nextLine();
        String sin = signal.toLowerCase(Locale.ROOT);
        switch (sin){
            case "red":
                System.out.println("Stop"); break;
            case "green":
                System.out.println("Go"); break;
            case "yellow":
                System.out.println("Slow down"); break;
            default:
                System.out.println("Invalid"); break;
        }
    }
}
