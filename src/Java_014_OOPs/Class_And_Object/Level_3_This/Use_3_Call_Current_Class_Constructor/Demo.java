package Java_014_OOPs.Class_And_Object.Level_3_This.Use_3_Call_Current_Class_Constructor;

public class Demo {
    Demo(){
        this(10);
        System.out.println("DC Demo");
    }
    Demo(int x){
        System.out.println("Parametrized Constructor: "+x);
    }
}
