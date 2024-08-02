package loop;

public class DoWhile2 {

    public static void main(String[] args) {
        int i = 10;

        do {
            System.out.println("현재 숫자는:" + i);
            i++;    // do 먼저 실행하고 조건문 실행 후 do 또 실행
        } while (i < 3);  // 조건이 거짓이라 바로 빠져나감
    //do-while문은 촤초 한번은 항상 실행된다.
    }
}
