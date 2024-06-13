import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3개의 정수를 공백으로 구분하여 입력받음
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        // 합계 계산
        int sum = num1 + num2 + num3;
        System.out.println("sum : " + sum);

        // 평균 계산
        int average = sum / 3;
        System.out.println("avg : " + average);

    }
}



//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Q1 {
//    public static void main(String[] args) throws IOException {
//
//        // 3개의 정수 입력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//
//        // 공백을 기준으로 입력값 나누기
//        String[] inputStrings = input.split(" ");
//        int[] numbers = new int[inputStrings.length];
//        for(int i = 0; i < inputStrings.length; i++) {
//            numbers[i] = Integer.parseInt(inputStrings[i]);
//        }
//
//        // 합계 계산
//        int sum = 0;
//        for(int num:numbers) {
//            sum += num;
//        }
//        System.out.println("sum : " + sum);
//
//        // 평균 계산
//        int avg = sum / numbers.length;
//        System.out.println("avg : " + avg);
//    }
//}
