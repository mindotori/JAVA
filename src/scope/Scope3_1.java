package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // if문 내에서만 사용하는 임시 변수를 바깥에 선언하면 - 비효율적 메모리 사용 / 코드 복잡성 증가
        if(m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    } // 좋은 코드는 군더더기 없는 단순한 코드
}
