package Java_009_SwitchStatement;

public class Lab064_AllowsArrow {
    public static void main(String[] args) {
        // after java13 it was added.
        // Allows arrow
        // in the case of arrows we don't have to use break.
        int itemCode =001;
        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
