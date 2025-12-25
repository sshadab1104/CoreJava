package Java_010_String;

public class Lab_095_MostUsedStringMethods {
    public static void main(String[] args) {
        // length()        Count characters
        // 1. Find String Length
        String name = "Shadab";
        System.out.println(name.length());
        System.out.println("----------------");

        // toUpperCase()    Convert to uppercase
        String str = "shaikh";
        System.out.println(str.toUpperCase());
        System.out.println("----------------");

        // to LowerCase()   Convert to lowercase
        String str1 = "LOWERCASE";
        System.out.println(str1.toLowerCase());
        System.out.println("----------------");

        // charAt()         Get character
        String str2 = "chatAT";
        System.out.println(str2.charAt(2));
        System.out.println("----------------");

        // contains()       Check substring
        String str3 = "My Name is Shadab";
        String str4 = "shadab";
        System.out.println(str4.contains("f"));
        System.out.println(str3.contains("My"));
        System.out.println("----------------");

        // equals()         Compare content
        System.out.println("----------------");
        String s = "shadab";
        String s1 = "Shaikh";
        System.out.println(s.equals(s1));
        System.out.println(s.equals("shadab"));
        System.out.println("----------------");

        // equalsIgnoreCase() Ignore case
        System.out.println(s1.equals("shaikh"));
        System.out.println("----------------");

        // trim()           Remove spaces
        String sa = "   My name is shadab   ";
        System.out.println(sa.trim());
        System.out.println("----------------");

        // split()          Break string
        String fruits = "Banana Papaya Apple";
        String[] fr= fruits.split(" ");
        for(String fruit : fr){
            System.out.println(fruit);

        }
        System.out.println("----------------");

        // replace()        Replace text
        String rep = "replace";
        System.out.println(rep.replace('r','d'));
        String words = " My Name is Shaikh";
        rep = words.replace("Shaikh","Shadab");
        System.out.println(rep.trim());
        System.out.println("----------------");

        // substring()      Extract part
        String sb = "My Name Zohan";
        String sb1 = sb.substring(3,7);
        System.out.println(sb1);

    }
}
