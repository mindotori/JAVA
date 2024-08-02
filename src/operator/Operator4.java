package operator;

public class Operator4 {
    public static void main(String[] args) {

        int sum3 = 2 * 2 + 3 * 3; // (2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); // sum3 같다. => 복잡해지기 시작하면 읽기 편하게 괄호 쓰는게 낫다
        System.out.println(sum3);
        System.out.println(sum4);
        // 코드를 좀 더 쓰더라도 명확하고 단순한 것이 유지보수에 좋다.
        // 연산자 우선순위가 애매하거나 조금이라도 복잡해지면 언제나 괄호를 고려하자!

    }
}
