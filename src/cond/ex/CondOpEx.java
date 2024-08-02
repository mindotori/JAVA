package cond.ex;

public class CondOpEx {
    public static void main(String[] args) {
    // 더 큰 숫자 찾기
        // 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력하는 코드를 작성하자.
        int a = 300;
        int b = 20;

        int max = (a > b) ? a : b;
        // a가 b보다 크다면 max에 a를 담고 아니면 b를 담는다.
        System.out.println("더 큰 숫자는 " + max + "입니다.");

    }
}
