package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력 a + b = 7

        //뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        //나눗셈
        int div = a / b;
        System.out.println("a / b = " + div); // 정수 나누기 정수는 정수 (소수점 버려짐)

        //나머지
        int mod = a % b;
        System.out.println("a % b = " + mod); // 나머지 구함

        // 주의
        // 0으로 나누기는 불가능 (수학에서 허용하지 않음)
        // int z = 10 / 0; => 오류발생
        // 예외가 발생하면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료된다.

    }
}
