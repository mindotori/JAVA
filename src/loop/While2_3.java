package loop;

public class While2_3 {

    public static void main(String[] args) {
        // i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라 (i - endNum 더하기)
        //예)
        // i = 1, endNum=3이라고 하면 1 -3 까지 총 3번 더해야한다.
        // i = 1. endNum=10이라고 하면 1-10까지 총 10번 더해야한다.
        // i = 10. endNum=12이라고 하면 10-12까지 총 3번 더해야한다.
        int sum = 0;
        int i = 1; // 시작점
        int endNum = 10; // 마무리

        // i=1, endNum=3
        while (i <= endNum){
            sum = sum + i;
            System.out.println("i=" + i + " sum=" + sum);
            i++;
        }
    }
}
