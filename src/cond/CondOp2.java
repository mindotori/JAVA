package cond;

public class CondOp2 {
    public static void main(String[] args) {
        //삼항 연산자
        //(조건) ? 참_표현식 : 거짓_표현식
        // if문 처럼 코드 블럭을 넣을 수 있는 것이 아니라 단순한 표현식만 넣을 수 있다
        int age = 17;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status);

    }
}
