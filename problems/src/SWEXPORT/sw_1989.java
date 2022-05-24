package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 거꾸로 읽어도 제대로 읽은 것과 같은 문장이나 낱말을 구하여라
 * <p>
 * 1. char 배열에 입력받은 문자를 저장한다
 * 2. 배열 나누기 2 하여 두 부분으로 나눈다
 * 3. 나눈 값 만큼 반복하여 단어 첫 부분과 나중 부분이 같은지 확인한다
 * 4. 같은 값이면 1 을 주고 반복 하고 아니면 0 을 주고 반복을 끝낸다.
 */

public class sw_1989 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1989.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int tc = 1; tc <= T; tc++) {
            String str = sc.next();
            char[] arr = str.toCharArray();
            int truth = 1;
            int helf = str.length() / 2;
            for (int i = 0; i < helf; i++) {
                if (arr[i] != arr[str.length() - i - 1]) {
                    truth = 0;
                    break;
                }
            }
            System.out.printf("#%d %d\n", tc, truth);
        }
    }
}

