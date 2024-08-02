package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        switch (grade) { //switch 는 단순히 값이 같은지 확인하는 연산만 가능(문자도 가능)
            case 1:
                coupon = 1000;
                break;
            case 2:
            case 3:
                coupon = 3000;
                break;
            default: //else 같은 역할
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
