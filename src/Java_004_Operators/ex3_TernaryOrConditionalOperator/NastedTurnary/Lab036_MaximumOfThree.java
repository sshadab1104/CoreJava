package Java_004_Operators.ex3_TernaryOrConditionalOperator.NastedTurnary;

public class Lab036_MaximumOfThree {
    public static void main(String[] args) {
        int a = 40, b = 120, c = 30;
        int result = (a>b && a>c)? a :(b>c)?b : c;
        System.out.println(result);
    }
}
