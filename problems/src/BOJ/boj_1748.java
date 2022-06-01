package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1부터 N까지의 수를 이어서 쓰면 다음과 같이 새로운 하나의 수를 얻을수 있다.
 */

public class boj_1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        int count=0;

        int add=1;

        int b=10;

        for (int i = 1; i <= T; i++) {
            if (i % b == 0) {
                add++;
                b *= 10;
            }
            count += add;
        }

        System.out.println(count);
    }

}