package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // ++a: 전위(Prefix) 증감 연산자
        // a++: 후위(Postfix) 증감 연산자

        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예
        a = 1; //a값을 다시 1로 지정
        b = 0; //b값을 다시 0으로 지정

        b = a++; //a의 현재 값을 b에 먼저 대입하고, 그 후 a값을 증가시킴
        System.out.println("a = " + a + ", b = " + b); // 결과 a = 2, b = 1


        // 단독으로 있는 경우: 이런 경우에는 자기 것만 증감시키면 되니까 별 차이 없음
        ++a;
        System.out.println(a);
        a++;
        System.out.println(a);
    }
}
