package Java_002_Variables;

public class Lab015_InstanceVariable {

    String name;   // instance variable
    int age;       // instance variable

    public void testLogin(){
        String userName = "admin";
        int MaxPwd = 3;
    }
}

//Instance Variable: Declared inside a class but outside methods;
// each object gets its own copy.

//✔ Features:
//  1. Each object gets its own copy
//  2. Has default values
//  3. Stored in heap memory

