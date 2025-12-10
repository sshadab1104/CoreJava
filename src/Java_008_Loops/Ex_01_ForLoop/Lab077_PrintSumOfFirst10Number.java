package Java_008_Loops.Ex_01_ForLoop;

public class Lab077_PrintSumOfFirst10Number {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
