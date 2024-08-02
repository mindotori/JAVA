package cond;

public class If2 {
    public static void main(String[] args) {
        //else: 만족하는 조건이 없을 때 실행되는 조건

        int age = 20; // 사용자의 나이

        if(age >= 18) {
            System.out.println("성인입니다."); // 참일 때
        } else {
            System.out.println("미성년자입니다."); // 거짓일 때
        }
    }
}
