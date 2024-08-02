package scope;

public class Scope1 {
    public static void main(String[] args) {
        //지역 변수: 특정 지역에서만 사용할 수 있다.( 코드 블록 내)
        int m = 10; // m 생존 시작
        if(true) {
            int x = 20; // x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // x생존 종료
//        System.out.println(x); <- x 생존 ㄴㄴ = 사용 못함
        System.out.println(m); // <- m은 생존중
    }   // m 생존 종료
}
