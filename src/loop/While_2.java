package loop;

public class While_2 {
    // while 문은 조건에 따라 코드를 반복해서 실행할 때 사용한다.
    // 조건식이 참이면 코드 블럭을 실행하고, 거짓이면 while 문을 벗어난다.
    // 조건식이 참이면 코드 블럭 실행하고 이후에 코드 블럭이 끝나면 다시 조건식 검사로 돌아가서 조건식을 검사한다.(무한 반복)
    public static void main(String[] args) {
        int count = 0;

        while (count < 3) {
            count = count + 1;
            System.out.println("현재 숫자는: " + count);
        }
    }
}
