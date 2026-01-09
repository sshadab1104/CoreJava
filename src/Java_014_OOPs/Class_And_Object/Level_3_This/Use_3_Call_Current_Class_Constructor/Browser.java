package Java_014_OOPs.Class_And_Object.Level_3_This.Use_3_Call_Current_Class_Constructor;

public class Browser {
    Browser(){
        this("Chrome");
        System.out.println("DC");
    }
    Browser(String name){
        System.out.println("Browser: "+name);
    }
}
