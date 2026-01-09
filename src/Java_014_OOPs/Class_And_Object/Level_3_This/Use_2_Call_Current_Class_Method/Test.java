package Java_014_OOPs.Class_And_Object.Level_3_This.Use_2_Call_Current_Class_Method;

public class Test {
    void run(){
        System.out.println("Running");
    }
    void start(){
        this.run();
        System.out.println("Start");
    }
}
