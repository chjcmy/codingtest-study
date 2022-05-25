package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ai 배열과 bj 배열이 있다. ai 배열에 bj 배열 중 bj 배열을 넘지 않도록 bj 원소에 ai 배열을 곱해서 제일 큰 값을 구하라.
 *
 * 1. ai 배열과 bj 배열을 크기를 각 각 받는다.
 * 2. 받은 값으로 ai 와 bj 배열을 만든다.
 * 3. N에 bj 배열의 크기에서 ai 배열의 크기를 빼서 값을 저장한다.
 * 4. max 값을 만들고 ai 배열과 bj 배열에서 제일 큰 값을 가져온다.
 * 5. 그 후 max 값을 출력한다.
 */

public class sw_1959 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1959.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] ai = new int[N];
            int[] bj = new int[M];
            int size;
            if (N < M) {
                size = M - N;
            } else {
                size = N - M;
            }
            for (int i = 0; i < N; i++) {
                ai[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                bj[i] = sc.nextInt();
            }
            int max = 0;
            if (N < M) {
                for (int i = 0; i <= size; i++) {
                    int temp = 0;
                    for (int j = 0; j < N; j++) {
                        temp += ai[j] * bj[i + j];
                    }
                    if (temp > max) {
                        max = temp;
                    }
                }
            } else {
                for (int i = 0; i <= size; i++) {
                    int temp = 0;
                    for (int j = 0; j < M; j++) {
                        temp += ai[i + j] * bj[j];
                    }
                    if (temp > max) {
                        max = temp;
                    }
                }
            }
            System.out.println("#" + tc + " " + max);
        }
    }
}
