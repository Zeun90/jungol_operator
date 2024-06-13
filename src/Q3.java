import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 입력 받기
        int inputNum = scanner.nextInt();

        // 후치 증가
        System.out.println(inputNum++);
        System.out.println(++inputNum);
    }
}
