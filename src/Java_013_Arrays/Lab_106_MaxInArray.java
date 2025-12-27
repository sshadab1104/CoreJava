package Java_013_Arrays;

public class Lab_106_MaxInArray {
    public static void main(String[] args) {
        int[] arr = {45,78,4,9,100,47,98,53};
        int max = -1;
        for (int i = 0; i<arr.length; i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
