package Java_014_OOPs.Class_And_Object.Level_2_Constructor_Practice;

public class Lab_126_Constructors {
    public static void main(String[] args) {
        Car_DC tesla = new Car_DC();
        System.out.println(tesla.name);
        System.out.println(tesla.model);
        System.out.println(tesla.year);

        // We can change the value also.
        Car_DC nano = new Car_DC();
        nano.name = "Tata nano";
        nano.model = "SUV";
        nano.year = 2015;
        System.out.println(nano.name);
        System.out.println(nano.model);
        System.out.println(nano.year);
    }
}
