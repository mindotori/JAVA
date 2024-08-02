package cond;

public class Switch4 {
    public static void main(String[] args) {
        int grade =3;
        // 새로운 switch 문 - 선택된 데이터를 반환할 수 있다.
        int coupon = switch (grade) {
            case 1 -> 1000; // 화살표(->) 사용
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
