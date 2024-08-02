package loop.ex;

public class WhileEx2 {
    //반복문을 사용하여 처음 10개의 짝수를 출력하는 프로그램을 작성
    // num 이라는 변수를 사용하여 수를 표현
    public static void main(String[] args) {
        int num = 2;
        int count = 1;
        while(count <= 10) { // 처음 10개 제한 조건
            System.out.println(num);
            num += 2;  // 2씩 계속 더함
            count++;
        }
    }
}
