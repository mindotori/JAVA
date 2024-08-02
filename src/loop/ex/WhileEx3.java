package loop.ex;

public class WhileEx3 {
    // 1부터 max 까지의 합을 계산하고 출력하는 프로그램 저장
    // sum 이라는 변수를 사용하여 누적합 표현, i 라는 변수를 사용하여 카운트를 수행
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;
        int i = 1;

        while(i <= max) {
            sum += i; //
            i++;
        }
        System.out.println("1부터 100까지의 누적 합은 : "  + sum);
    }
}
