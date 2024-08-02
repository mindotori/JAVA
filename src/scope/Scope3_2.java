package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        int m = 10;
        if(m > 0) {
            int temp = m * 2;
            System.out.println("temp = " + temp);
        } // temp 변수를 사용하는 if 내에 선언함으로서 군더더기 없는 코드가 됨
//        System.out.println(temp); // 여기서 temp 접근 불가능
        System.out.println("m = " + m);
    }
}// 좋은 프로그램은 무한한 자유가 있는 프로그램이 아니라 적절한 제약이 있는 프로그램이다.
