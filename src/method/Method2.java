package method;

public class Method2 {

    public static void main(String[] args) {
        //매개변수가 없는 경우
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        //반환할 것이 없다면 걍 return만 써도 ㄱㅊ
        return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
        //return을 안넣어도 자바가 알아서 넣어줌
    }
}
