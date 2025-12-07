package Java_009_SwitchStatement;

import java.util.Scanner;

public class Lab062_SwitchBrowser {
    public static void main(String[] args) {
        // Web Automation.
        // I will ask the user which browser you want me to run the code.
        // Chrome -> execute chrome.
        // Firefox -> execute firefox.
        // edge -> execute edge.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the browser name: ");
        String browser = sc.next();
        switch (browser){
            case "Chrome":
                System.out.println("Staring the Chrome");
                break;
            case "Firefox":
                System.out.println("Staring the firefox");
                break;
            case "edge":
                System.out.println("Staring the edge");
                break;
            default:
                System.out.println("No Idea plz enter the valid browser name");

        }
        sc.close();
    }
}
