package cond;

public class Switch2 {
    public static void main(String[] args) {
//        switch (조건식) {
//            case value1:
//                 조건식의 결과 값이 value1일 때 실행되는 코드
//            case value2;
//                 조건식의 결과 값이 val2일 때 실행되는 코드
//                break;
//            default:
//                조건식의 결과 값이 위의 어떤 값에도 해당되지 않을 때 실행되는 코드
//        }
        int grade = 3;

        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2:
                coupon = 2000;
                break;
            case 3:
                coupon = 3000;
                break;
            default: //else같은 역할
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }
}
