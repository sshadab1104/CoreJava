package Java_006_IfCondition;

public class Lab054_InterviewQue3 {
    public static void main(String[] args) {
        boolean a = true;
        a = !a;
        if(2 + 2 < 4){
            System.out.println("Inside the loop");
        }
        else {
            System.out.println("Outside -> "+ a);
        }
        // What will be the output? ans: Outside -> !a
    }
}
