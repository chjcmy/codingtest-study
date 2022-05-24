package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 사재기의 최대량을 구하시오
 * 1. 사재기한 수를 num, max 사재기 한 수 만큼 배열에 추가한다
 * 2. num 배열에는 원료 차례대로 값을 넣고, max 배열에는 num 의 마지막 부터 Max 값을 넣는다.
 * 3. num의 크기만큼 배열을 돌리면서 만약 num[1] 값이 max 보다 작을경우에는 sum 에 max[i] - num[i] 값을 더한다.
 * 4. 마지막으로 sum 을 프린트 해준다
 */

public class sw_1859_1 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1859.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int t = 1; t <= T; t++) {
            int some = sc.nextInt();
            int m = 0;
            int[] N = new int[some];
            int[] M = new int[some];
            for (int i = 0; i < some; i++) N[i] = sc.nextInt();
            for (int i = 0; i < some; i++) {
                if (N[i] > 10000) {
                    System.out.println("#" + t + " " + 0);
                    continue;
                }
            }
            for (int i = some-1; i >= 0; i--) {
                if (N[i] > m) {
                    m = N[i];
                    M[i] = m;
                } else {
                    M[i] = m;
                }
            }
            long sum = 0;
            for (int i = 0; i < M.length; i++) {
                if (N[i] < M[i]) {
                   sum += M[i] - N[i];
                }
            }
            System.out.println("#" + t + " " + sum);
        }
    }
}
