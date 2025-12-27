package Java_013_Arrays;

public class Lab_103_Ex1 {
    public static void main(String[] args) {
        //Q. Given an array of marks of students, if the mark of any student is less than
        //   35 print its roll number. [roll number here refers to the index of array.]
        int[] marks = {100,95,85,21,17,71,36,35,7};
        for (int i =0; i<marks.length; i++){
            if(marks[i] < 35){
                System.out.println(marks[i]);

            }
        }
    }
}
