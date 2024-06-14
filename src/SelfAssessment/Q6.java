package SelfAssessment;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2개의 정수 입력
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 관계 연산자
        System.out.printf("%d > %d --- %b\n", num1, num2, num1>num2);
        System.out.printf("%d < %d --- %b\n", num1, num2, num1<num2);
        System.out.printf("%d >= %d --- %b\n", num1, num2, num1>=num2);
        System.out.printf("%d <= %d --- %b", num1, num2, num1<=num2);
    }
}
