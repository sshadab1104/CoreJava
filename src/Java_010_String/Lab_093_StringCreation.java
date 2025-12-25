package Java_010_String;

public class Lab_093_StringCreation {
    public static void main(String[] args) {
        // 1. String Literal (Stored in String Constant Pool)
        String name = "Shadab";
        name = "Shaikh";
        name = "Shadab Shaikh";
        name = "Shadab"; // SCP

        System.out.println(name);

        //✔ Same memory
        //✔ Memory efficient

       // 2. Using new Keyword (Stored in Object area or Heap Area)
        String s3 = new String("Java");

        //✔ Creates a new object every time

    }
}
