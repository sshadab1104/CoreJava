package Java_013_Arrays;

public class Lab_107_SecondMaxInArray {
    public static void main(String[] args) {
        int[] arr = {100,98,78,85,45};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max)
                max = arr[i];
        }
        int smax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>smax && arr[i]!=max)
                smax = arr[i];
        }
        int tmax = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if(arr[i]>tmax && arr[i]!=smax && arr[i]!=max)
                tmax= arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
        System.out.println(tmax);



    }
}
