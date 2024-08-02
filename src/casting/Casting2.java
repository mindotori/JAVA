package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 큰 범위 -> 작은 범위 대입은 명시적 형변환 필요
        double doubleValue = 1.5;
        int intValue = 0;

//        intValue = doubleValue; // 컴파일 오류 발생 (incompatible type : 호환되지 않는 유형)
          intValue = (int) doubleValue; // 명시적 형변환
        System.out.println(intValue); // int 형이라 소수점 재낌


        System.out.println(10.5);
        System.out.println((int) 10.5); // casting: => 10.5를 int 형으로
    }
}
