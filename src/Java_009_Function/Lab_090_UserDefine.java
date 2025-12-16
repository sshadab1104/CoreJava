package Java_009_Function;

public class Lab_090_UserDefine {
    public static void main(String[] args) {
        // 1. Without Parameters and without Return Type.
        // 2. Without Parameters but with Return Type.
        // 3. With Parameters and without Return Type.
        // 4. With Parameters and with Return Type.
        for (int i=1; i<=2; i++){
            greet();
        }
        String s = greet_with_hello();
        System.out.println(s);


    }
    //1. Without Parameters and without Return Type. Declaration
    static void greet(){
        System.out.println("Hi How are you");
    }

    // 2. Without Parameters but with Return Type.
    static String greet_with_hello(){
        return "Hi, I am fine";
    }
}
