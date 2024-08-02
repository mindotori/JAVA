package loop;

public class DoWhile1 {

    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는:" + i);
            i++;
        } // 이러면 i는 조건을 만족시키지 못해서 아무것도 출력 x -  바로 빠져나옴
    }
}
