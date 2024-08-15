package method;

public class MethodValue3 {
    //main()에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘 다 number로 같다.
    //근데 둘은 완전히 다른 변수임
    public static void main(String[] args) {
        int num1 = 5;
        System.out.println("changeNumber 호출 전, num1: " + num1); //5
        num1 = changeNumber(num1); //num1에 10 대입
        System.out.println("changeNumber 호출 후, num1: " + num1);//10
    }

    public static int changeNumber(int num2){
        num2 = num2 * 2;
        return num2;
    }
}
