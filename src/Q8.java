import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 3개의 정수 입력
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 첫 번째 수가 가장 큰지
        boolean isFirstNumLargest = (num1 > num2 && num1 > num3);

        // 3개의 수가 모두 같은지
        boolean isAllNumsEqual = (num1 == num2 && num2 == num3);

        System.out.printf("%b %b", isFirstNumLargest, isAllNumsEqual);
    }
}
