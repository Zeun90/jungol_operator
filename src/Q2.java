import java.util.Scanner;


public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 2개의 정수를 입력받음
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 연산
        int sum = num1 + 100;
        int mod = num2 % 10;

        // 연산 출력
        System.out.printf("%d %d", sum, mod);

    }
}