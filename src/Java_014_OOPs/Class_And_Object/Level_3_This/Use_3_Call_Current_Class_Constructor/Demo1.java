package Java_014_OOPs.Class_And_Object.Level_3_This.Use_3_Call_Current_Class_Constructor;

public class Demo1 {
    Demo1(){
        this(10);
        System.out.println("DC");
    }
    Demo1(int x){
        this("Java");
        System.out.println("Demo1 int: "+x);
    }
    Demo1(String s){
        System.out.println("String: "+s);
    }
}
