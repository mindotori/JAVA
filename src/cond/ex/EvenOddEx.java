package cond.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        // 홀수 짝수 찾기
        // 정수 x가 주어지면 x가 짝수이면 "짝수"를, 홀수이면 "홀수"를 출력하는 프로그램을 작성하자
        // 삼항 연산자 사용
        int x = 2;
        String result = (x % 2 == 0)? "짝수" : "홀수"; // 참/거짓 결과값이 문자열이니 String 타입 사용
        System.out.println("x = " + x + ", " + result);
    }
}
