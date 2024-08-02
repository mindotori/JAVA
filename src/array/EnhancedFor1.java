    package array;

    public class EnhancedFor1 {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};

            //일반 for문
            for(int i = 0; i < numbers.length; i++) {
                int number = numbers[i];
                System.out.println(number);
            }

            // iter - 인텔리j for-each문 단축키
            //향상된 for문, for-each문 - 배열의 인덱스를  사용하지 않고, 종료 조건을 주지 않아도 된다.
            for(int number : numbers) { //배열에 있는 값을 다 돈다 / :의 오른쪽에 탐색할 배열 선택
                System.out.println(number);
            }

            //for-each문을 사용할 수 없는 경우 : 증가하는 index 값 필요
            for (int i = 0; i < numbers.length; i++){
                System.out.println("number" + i + "번의 결과는: " + numbers[i]);
            }
        }
    }
