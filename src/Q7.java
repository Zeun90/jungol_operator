import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2개의 정수 입력
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        boolean num1IsTrue = (num1 != 0);
        boolean num2IsTrue = (num2 != 0);

        // 논리곱 (AND)
        boolean andOperation = num1IsTrue && num2IsTrue;

        // 논리합 (OR)
        boolean orOperation = num1IsTrue || num2IsTrue;

        System.out.printf("%b %b", andOperation, orOperation);
    }
}
