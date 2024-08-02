package loop.ex;

public class NesteEx1 {

    //구구단 출력  - 중첩 for 문 사용
    // 1 * 1 = 1
    // ...
    // 9 * 9 = 81
    public static void main(String[] args) {
        for(int i=1;i<=9;i++) {
            for(int j=1;j<=9;j++){
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
