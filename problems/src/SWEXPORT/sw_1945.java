package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * N 에는 2, 3, 5, 7, 11 이라는 수가 있다. N이 어떻게 이루어져있는지 출력하라
 * <p>
 * 1. 2, 3, 5, 7, 11 소인수분해할 정수 배열을 만든다.
 * 2. 소인수 분해 를 한뒤 count 를 할 배열을 하나 만든다.
 * 2. N을 입력 받는다.
 * 3. 소인수분해 할 정수 배열 길이 만큼 for 문을 돌리면서 N을 소인수분해 한다.
 * 4. for 문안에는 soin 이란 변수를 주고 N 값을 저장한다.
 * 5. 안에 또 for 문을 돌리면서 soin이 분해 될때 마다 count에 1을 추가한다.
 * 6. 더이상 분해가 되어도 나머지 가 0이 아니면 count가 counts 배열에 저장된다.
 */

public class sw_1945 {
    static int[] smallNumbers = {2, 3, 5, 7, 11};
    
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1945.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            System.out.printf("#%d ", tc);
            for (int smallNumber : smallNumbers) {

                boolean coin = false;
                int count = 0;

                while (!coin) {
                    if (N % smallNumber == 0) {
                        N /= smallNumber;
                        count++;
                    } else {
                        System.out.printf("%d ", count);
                        coin = true;
                    }
                }
            }
            System.out.println();
        }
    }
}
