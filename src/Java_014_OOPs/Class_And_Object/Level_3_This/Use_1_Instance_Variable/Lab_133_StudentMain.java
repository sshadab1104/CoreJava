package Java_014_OOPs.Class_And_Object.Level_3_This.Use_1_Instance_Variable;

public class Lab_133_StudentMain {
    public static void main(String[] args) {
        Student s = new Student(12);
        Student s1 = new Student(45);
        s.display();
        s1.display();
    }
}
