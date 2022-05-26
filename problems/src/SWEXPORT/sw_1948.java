package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 월 일로 이루어진 날짜를 2개 입력 받아, 두 번째 날짜가 첫 번째 날짜의 며칠때 인지 풀력하는 프로그램을 작성 하라
 *
 * 1. 1월 부터 12월 까지 몇일 이 있는 지 알수 있는 일차원 배열을 만든다.
 * 2. 입력 받은 두 날짜를 각각 월, 일로 저장한다.
 * 3. 첫번째 달 부터 두번째 달까지 반복 하게 만든다.
 * 4. 달이 같다면 첫달과 두번째 달이 같을경우 두번째 일을 sum 에 추가 한다.
 * 5. 마지막달이 M 일경우 두번째 일을 더 해준다
 * 6. 그리고 sum 을 더해준다
 */

public class sw_1948 {
    static int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1948.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int firstMonth = sc.nextInt();
            int firstDay = sc.nextInt();
            int secondMonth = sc.nextInt();
            int secondDay = sc.nextInt();
            int sum = 0;

                for (int i = firstMonth; i <= secondMonth; i++) {
                    if (firstMonth == secondMonth) {
                        sum = secondDay;
                    } else if (i == firstMonth) {
                        sum += month[i - 1] - firstDay + 1;
                    } else if (i == secondMonth) {
                        sum += secondDay;
                    } else {
                        sum += month[i - 1];
                    }
                }
            System.out.printf("#%d %d\n", tc, sum);
        }
    }
}
