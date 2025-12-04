package Java_005_TakingInput;

public class Lab049_ConsoleArg {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        System.out.println(age>25 ? "Allowed to go to GOA" : "Not Allowed");
    }

}
