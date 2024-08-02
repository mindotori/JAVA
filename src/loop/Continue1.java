package loop;

public class Continue1 {

    public static void main(String[] args) {
        int i = 1;


        while(i <= 5) {
            if (i==3) {
                i++;
                continue; // if 조건을 만족시키면 i++하고 continue - continue 발동되면 밑에 식 무시하고 다시 while로 간다.
                          // 그래서 3이 찍히지 않는 것이다.
            }
            System.out.println(i);
            i++;
        }
    }
}
