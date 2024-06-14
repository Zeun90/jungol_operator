package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cntInput = st.countTokens();
        int kor = Integer.parseInt(st.nextToken());
        int eng = Integer.parseInt(st.nextToken());
        int mat = Integer.parseInt(st.nextToken());
        int com = Integer.parseInt(st.nextToken());

        int sum = kor + eng + mat + com;
        int avg = sum / cntInput;

        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }
}
