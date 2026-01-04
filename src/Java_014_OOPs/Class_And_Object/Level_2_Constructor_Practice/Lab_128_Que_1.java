package Java_014_OOPs.Class_And_Object.Level_2_Constructor_Practice;

public class Lab_128_Que_1 {
    // Create Browser class with constructor accepting browser name.
    public static void main(String[] args) {
        browser b1 = new browser("Chrome");
        browser b2 = new browser("firefox");
    }

}

class browser{
    String browserName;
    browser (String browserName){
        this.browserName = browserName;
        System.out.println("Launching Browser: "+ browserName);
    }

}
