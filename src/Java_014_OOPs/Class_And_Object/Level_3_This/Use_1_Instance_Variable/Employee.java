package Java_014_OOPs.Class_And_Object.Level_3_This.Use_1_Instance_Variable;

public class Employee {
        int empId;

        Employee(int empId){
            this.empId = empId;
        }

        void display(){
            System.out.println("Employee Id is: "+empId);
        }
}
