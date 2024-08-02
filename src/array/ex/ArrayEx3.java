package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요:");
        for(int i=0; i < numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        // 0 1 2 3 4
        for(int i = 4; i >= 0;i--){
            System.out.print(numbers[i]);
            if(i > 0) { //마지막 숫자 뒤 , 는 제거 목적
                System.out.print(", ");
            }
        }
    }
}
