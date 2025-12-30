package Java_014_OOPs.Class_And_Object_01;

public class Lab_118_Student_RunnerClass {
    public static void main(String[] args) {
        // Object Creation
        Student s = new Student();
        s.name = "Shadab";
        s.age = 36;

        // Function / Method call
        s.display();

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 25;
        s1.display();
    }
}
