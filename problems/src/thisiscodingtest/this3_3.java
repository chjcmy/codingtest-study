package thisiscodingtest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 카드 행마다 작은 수를 끝낸 뒤 제일 큰 수를 저장한다
 * 1. 카드 행을 입력 받은 뒤 제일 작은 수를 result 배열에 저장한다
 * 2. result 배열을 정렬 한뒤 제일 큰수를 프린트 한다
 */

public class this3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] total = new int[N];
        for (int i = 0; i < N; i++) {
            int min = 100;
            for (int j = 0; j < M; j++) {
                int a = sc.nextInt();
                if (min > a) {
                    min = a;
                }
            }
            total[i] = min;
        }
        Arrays.sort(total);
        System.out.println(total[total.length - 1]);
    }
}
