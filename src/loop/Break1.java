package loop;

public class Break1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while(true) {
            sum = sum + i;
            if(sum >10) { // 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
                System.out.println("합이 10보다 크면 종료: i=" + i + "sum=" + sum);
                break; // break가 있어야 중간에 빠져나오기 가능
            }
            i++;
        }
    }
}
