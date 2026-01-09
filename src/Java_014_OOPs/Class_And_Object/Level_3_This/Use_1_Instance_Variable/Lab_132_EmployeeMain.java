package Java_014_OOPs.Class_And_Object.Level_3_This.Use_1_Instance_Variable;

public class Lab_132_EmployeeMain {
    public static void main(String[] args) {
        Employee emp = new Employee(101);
        Employee emp1 = new Employee(102);
        emp.display();
        emp1.display();
    }
}
