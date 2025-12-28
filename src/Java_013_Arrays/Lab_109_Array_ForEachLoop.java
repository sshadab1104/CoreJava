package Java_013_Arrays;

import java.util.Arrays;

public class Lab_109_Array_ForEachLoop {
    public static void main(String[] args) {
        int[] num = {20,25,4,45,1,78,42,63};
        Arrays.sort(num);
        for (int i:num){
            System.out.println(i);
        }

        String[] names = {"Shadab","Zohan","Shaikh","Faheem","Sar"};
        for (String name: names){
            System.out.println(name);
        }
        String[] fruits = {"Apple","Banana","Orange","Grapes"};
        for (String fruit: fruits){
            System.out.println(fruit);
        }
    }
}
