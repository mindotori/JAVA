package loop;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        // 1+2+3 = 6
        // for (초기식; 조건식; 증감식) - 생략가능하지만 세미콜론은 냅둬야함
        //sum = 1+2+3 누적
        for(int i=1; i<=endNum; i++) {
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
        }
    }
}
