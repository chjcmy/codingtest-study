package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * S 마켓에서 손님에게 거슬러 주어야 할 금액 N이 입력되면 돈의 최소 개수로 거슬러 주기 위하여 각 종류의 돈이 몇 개씩 필요 한지 출력 하라.
 *
 * 1. 거스름돈 종류의 배열로 만든다.
 * 2. 거슬러줄 돈 종류의 배열을 만든다
 * 2. 손님의 잔돈을 N에 저장한다.
 * 3. 잔돈의 배열 갯수 만큼 N 을 나누고 나온 값은 거슬러줄 돈 종류 배열에 순서대로 저장한다.
 * 4. 나누어 준 뒤 나머지를 구하여 N 에 저장 한다.
 * 5. 반복이 끝나면 거슬러줄 돈의 배열을 나열한다.
 */

public class sw_1970 {

    static int[] typeOfChange = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1970.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

            int[] givenMoney = new int[8];

            int money = sc.nextInt();

            for (int i = 0; i < 8; i++) {
                givenMoney[i] = money / typeOfChange[i];
                money = money % typeOfChange[i];
            }

            System.out.printf("#%d\n", tc);
            for (int i = 0; i < 8; i++) {
                System.out.printf("%d ", givenMoney[i]);
            }
            System.out.println();
        }
    }
}
