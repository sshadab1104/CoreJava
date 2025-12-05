package Java_006_IfCondition;

public class Lab056_If_ElseIf_Else {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 20;
        // 1 -> num1 > num2
        // 2 -> num2 > num1
        // 3 -> num1 == num2
        if (num1 > num2){
            System.out.println("num1 > num2");
        } else if (num2 > num1) {
            System.out.println("num2 > num1");
        }
        else {
            System.out.println("equal");
        }
    }
}
