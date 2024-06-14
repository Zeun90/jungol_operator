package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int minSuHeight = Integer.parseInt(st1.nextToken());
        int minSuWeight = Integer.parseInt(st1.nextToken());
        int giYoungHeight = Integer.parseInt(st2.nextToken());
        int giYoungWeight = Integer.parseInt(st2.nextToken());

        boolean isMinSuTaller = minSuHeight > giYoungHeight;
        boolean isMinSuHeavier = minSuWeight > giYoungWeight;

        System.out.println(isMinSuTaller && isMinSuHeavier);
    }
}
