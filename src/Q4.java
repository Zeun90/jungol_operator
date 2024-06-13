import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2개의 정수 입력
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // num1 후치 증가, num2 전치 감소, 두 수의 곱
        int mul = num1++ * --num2;

        System.out.printf("%d %d %d", num1, num2, mul);
    }
}
