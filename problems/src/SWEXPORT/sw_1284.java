package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * a사는 1l 터당 p 요금을 낸다
 * b사는 1l 터당 s 요금을 내고 r 리터 이하 요금은 q 이다.
 * 주어진 값 중에 싼 요금을 찾아라
 *
 * 1. a 사 리터당 p 요금을 과 사용한 리터 요금을 두개의 변수에 넣고 요금을 계산한다
 * 2. b사의 기본요금과 리터, 요금을 받고 총 요금을 받는다
 * 3. a사 요금과 b사 요금을 계산하여 낮은 금액을 출력한다
 */

public class sw_1284 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1284.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            int p = sc.nextInt();
            int Q = sc.nextInt();
            int R = sc.nextInt();
            int S = sc.nextInt();
            int totalWater = sc.nextInt();
            int aCharge = p * totalWater;
            int bCharge;
            if (R > totalWater) {
                bCharge = Q;
            } else {
                bCharge = Q + (totalWater - R) * S;
            }
            int total = Math.min(aCharge, bCharge);
            System.out.printf("#%d %d\n", i, total);
        }
    }
}
