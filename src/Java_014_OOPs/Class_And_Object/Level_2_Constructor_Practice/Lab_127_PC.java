package Java_014_OOPs.Class_And_Object.Level_2_Constructor_Practice;

public class Lab_127_PC {
    public static void main(String[] args) {
        Car2 t1 = new Car2("Tesla", 2015);
        System.out.println(t1.model);
        System.out.println(t1.year);

        Car2 t2 = new Car2("nano",2018);
        System.out.println(t2.year);
        System.out.println(t2.model);



    }
}
    class Car2{
        String model;
        int year;

        // Parameterized Constructor
        Car2 (String model_name, int year_created){
            System.out.println("PC");
            this.model = model_name;
            this.year = year_created;

        }
    }
