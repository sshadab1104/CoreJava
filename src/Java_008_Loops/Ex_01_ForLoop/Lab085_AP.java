package Java_008_Loops.Ex_01_ForLoop;

public class Lab085_AP {
    public static void main(String[] args) {
        //AP = Arithmetic Progression
        // 2, 5, 8, 11, 14, 17, 20
        int n = 20;
        for (int i = 2; i<= 3*n-1; i+=3){
            System.out.print(i+ " ");
        }
    }
}
