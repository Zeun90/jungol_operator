import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 2개의 정수 입력
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // 두 정수가 같으면 true 아니면 false
        System.out.println(num1 == num2);

        // 두 정수가 같으면 true 아니면 false
        System.out.println(num1 != num2);
    }
}
