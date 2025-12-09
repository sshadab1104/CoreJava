package Java_007_SwitchStatement;

public class Lab063 {
    public static void main(String[] args) {
        // JDK >13
        int itemCode = 003;
        switch (itemCode){
            case 001,002,005:
                System.out.println("All of the them are electronic gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mach");
                break;
            default:
                System.out.println("none");

        }
    }
}
