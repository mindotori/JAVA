package method;

import javax.swing.*;

//메서드와 형변환
public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5; //double을 int에 넣을 수 없긔
        //printNumber(number);
        printNumber((int) number); //명시적 형 변환을 사용해 double -> int 형 변환
    }

    public static void printNumber(int n){
        System.out.println("숫자: "+n);
    }
}
