package method;

public class MethodReturn1 {

    //반환 타입이 있으면 반드시 값을 반환해야 한다. (특히 조건문과 함께 사용할 때 주의해야 한다.)
    public static void main(String[] args) {
        boolean result = odd(2); //false
        System.out.println(result);
    }

    public static boolean odd(int i){
        if(i%2==1){
            return true; //이러고 끝내면 조건이 만족하지 않는 경우 컴파일 에러뜬다(return문 누락)
        } else {
            return false;
        }
    }
}
