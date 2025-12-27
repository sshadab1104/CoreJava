package Java_011_StringBuilder;

public class Lab_097_WhyStringBuilderNeeded {
    public static void main(String[] args) {
        // String creates new object everytime that is slow
        // But in the String Builder we can modify the same object
        // compare to String, String Builder performance is faster

        // Eg. Problem with String
        String s = "Java";
        s = s + "Selenium";

        // Solution: StringBuilder
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Selenium");
        System.out.println(sb);

    }
}
