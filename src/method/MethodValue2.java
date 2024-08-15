package method;

public class MethodValue2 {
    //main()에 정의한 변수와 메서드의 매개변수(파라미터)의 이름이 둘 다 number로 같다.
    //근데 둘은 완전히 다른 변수임
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number: " + number); //5
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number: " + number);//5
    }

    public static void changeNumber(int number){
        System.out.println("2. changeNumber 변경 전, number: " + number);//5
        number = number * 2; //num2에만 들어가고 num1에 영향 ㄴㄴ
        System.out.println("3. changeNumber 변경 후, number: " + number);//10
    }
}
