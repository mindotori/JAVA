package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50}; // student"s" 배열은 보통 복수

        int total = 0;
        // for(int i=0; i < students.length; i++){
        //     total += students[i];
        // }
        for(int student : students){ //위의 for문과 같다
            total += student;
        }



    }
}
