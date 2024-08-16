package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message, 3);
//        for(int i=0;i<3;i++){
//            System.out.println(message);
//        }

        printMessage(message,5);
//        for(int i=0;i<5;i++){
//            System.out.println(message);
//        }

        printMessage(message,7);
//        for (int i=0;i<7;i++){
//            System.out.println(message);
//        }
    }

    public static void printMessage(String message, int times){
        for(int i=0; i<times;i++){
            System.out.println(message);
        }
    }

}
