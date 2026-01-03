package Java_014_OOPs.Class_And_Object.Level_1_Foundation_Basic;

public class Lab_122_Environment_RunnerClass {
    public static void main(String[] args) {
        Environment e = new Environment();
        e.envName = "Test";
        e.display();

        Environment e1 = new Environment();
        e1.envName = "Production";
        e1.display();
    }
}
