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

        // 2. Without Parameters but with Return Type.

        String s = greet_with_hello();
        System.out.println(s);

        int age_of_vote = voting_age();
        System.out.println(age_of_vote);
        if (age_of_vote>= 18){
            System.out.println("You are allowed  to vote");
        }
        else {
            System.out.println("Not allowed");
        }

        // 3. With Parameters and without Return Type.
        greet_with_name("Shadab");
        greet_with_FN_LN("Shadab","Shaikh");

        // 4. With Parameters and with Return Type.
        int result = sum(4,6);
        System.out.println(result);


    }
    //1. Without Parameters and without Return Type. Declaration
    static void greet(){
        System.out.println("Hi How are you");
    }

    // 2. Without Parameters but with Return Type.
    static String greet_with_hello(){
        return "Hi, I am fine";
    }

    static int voting_age(){
        System.out.println("Vote age returned!");
        return 18;
    }

    // 3. With Parameters and without Return Type.
    static void greet_with_name(String name){
        System.out.println("Hi Your name is : "+ name);
    }

    static void greet_with_FN_LN(String FirstName,String LastName){
        System.out.println("Hi your Name is "+FirstName+" "+LastName);
    }
    // 4. With Parameters and with Return Type.
    static int sum(int a, int b){
        return a+b;
    }

}

