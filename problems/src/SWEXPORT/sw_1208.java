package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 한 쪽 벽면에 상자들이 쌍여 있다.
 * 높은 곳의 상자를 낮은 곳에 옮기는 방식으로 최고점과 최저점의 간격을 줄이는 작업을 평탄화라고 한다 평탄화를 모두 수행하고 나면,
 * 가장 높은곣과 가장 낮은 곳의 차이가 최대 1 이내가 된다. 평탄화 작업을 위해서 상자를 옮기는 작업 횟수에 제한이 걸려있을 때,
 * 제한된 횟수만큼 옮기는 작업을 한 후 최고점과 최저점의 차이를 반환하는 프로그램을 작성해라라
 * <p>
 * 1. 덤프할 횟수 값을 받아 변수에 저장한다.
 * 2. 100 상자의 일차원 배열을 만든다.
 * 3. 값이 들어 왔을시 배열에 추가 한다.
 * 4. 제일 작은 값이 있는 위치를 구하고 제일 큰 값의 위치를 구한다.
 * 5. 제일 작은 값에는 1을 더하고 제일 큰 값에는 -1을 더한다
 * 6. 덤프가 끝날때 까지 반복 한다.
 * 7. 제일 작은 값과 제일 큰 값을 구하고 차이를 구해서 출력한다.
 */

public class sw_1208 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1208.txt"));

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {

            int[] arr = new int[100];

            int Dump = sc.nextInt();

            for (int j = 0; j < 100; j++) {
                arr[j] = sc.nextInt();
            }


            for (int j = 0; j < Dump; j++) {
                arr[0]++;
                arr[99]--;
                Arrays.sort(arr);
            }

            System.out.printf("#%d %d\n", i, arr[99] - arr[0]);
        }
    }
}
