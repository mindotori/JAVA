package array;

public class ArrayDi3 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만들기
        int[][] arr = new int[][]{ // new int[][] 부분 생략 가능
            {1,2,3},
            {4,5,6}
        }; //2행 3열

        for(int row=0; row < arr.length; row++) {
            for(int column = 0; column < arr[row].length; column++){
                System.out.println(arr[row][column]+ " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
