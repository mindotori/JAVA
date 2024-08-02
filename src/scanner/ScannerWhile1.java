package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    // 사용자가 입력한 문자열을 그대로 출력하는 예제를 만들어보자
    // exit 라는 문자가 입력되면 프로그램을 종료한다.
    // 프로그램은 반복해서 실행된다.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("문자열을 입력하세요(exit: 종료):");
            String str = scanner.nextLine();
            if(str.equals("exit")) { // 문자열은 equals() 사용
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열: " + str);
            // while (true): 중간에 break 문을 만나기 전까지 무한 반복
            // 입력 받은 문자가 "exit"이면 프로그램을 종료 - while문 빠져나감
        }
    }
}
