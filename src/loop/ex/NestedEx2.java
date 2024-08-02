package loop.ex;

public class NestedEx2 {

    public static void main(String[] args) {

        int rows = 5;
        String star = "*";

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(star); // 문자열 변수 선언 안하고 그냥 "*"프린트해도 ㄱㅊ
            }
            System.out.println();
        }
    }
}