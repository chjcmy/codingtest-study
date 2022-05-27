package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 0에서 부터 제일 가깝게 위치에 돌을 던져라
 *
 * 0. N + 1 이라는 위치 배열을 만들면서 0이라는 수를 넣는다.
 * 1. 들어 오는 숫자들을 계속 적으로 배열안에 넣는다.
 * 2. 배열을 정렬 시킨다.
 * 3. 만약 그 수가 음수 일경우 -를 곱한뒤에 넣는다
 * 4. 배열을 정렬 시킨 뒤에 배열 1 위치의 값을 프린트 한다
 */

public class sw_1285 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1285.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N+1];

            arr[0] = 0;

            for (int j = 1; j <= N; j++) {
                int a = sc.nextInt();
                if (a < 0) arr[j] = -a;
                else arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);

            System.out.printf("#%d %d",i, arr[1]);
        }
    }
}