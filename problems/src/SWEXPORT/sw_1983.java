package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * n명의 학생 중 k 번째의 학생의 학점을 표시하라
 *
 * 1. n 을 입력받는다.
 * 2. k 값을 입력받는다.
 * 3. middle 값과 last 값과 homeWork 값을 받아 총점을 구한다.
 * 3. 0에서 n - 1 까지 반복 하면서 arr 배열에 저장한다.
 * 4. target 의 인덱스 위치를 받는다
 * 5. 찾은 인덱스 위치에 시험을 본 학생 총수 나누기 10을 하여 배수를 구한뒤 나누어 준다.
 * 6. score 배열에서 인덱스 위치를 찾아주고 위치를 출력 해준다.
 */

public class sw_1983 {

    static String[] score = {"D0", "C-", "C0", "C+", "B-", "B0", "B+", "A-", "A0", "A+"};

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1983.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            float[] arr = new float[n];

            for (int i = 0; i < n; i++) {
                float middle = sc.nextInt();
                float last = sc.nextInt();
                float homeWork = sc.nextInt();
                float total = (middle * 35 / 100) + (last * 45 / 100) + (homeWork * 20 / 100);
                arr[i] = total;
            }

            float target = arr[k-1];

            Arrays.sort(arr);

            int index = Arrays.binarySearch(arr, target) / (n / 10);

            System.out.printf("#%d %s\n", tc, score[index]);

        }
    }
}
