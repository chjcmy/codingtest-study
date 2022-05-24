package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * 각 문자열의 길이는 30이다. 마디의 최대 길이는 10이다. 반복 되는 마디의 길이를 출력 하시오
 *
 * 1. 입력 문자열을 저장을 한다
 * 2. 입력된 문자부터 i 와 문자 i부분 부터 i * 2 의 길이를 비교한다.
 */


public class sw_2007 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/2007.txt"));
        Scanner sc = new Scanner(System.in);

        int T;
        T = sc.nextInt();
        sc.nextLine();
        for (int tc = 1; tc <= T; tc++) {
            String s = sc.next();
            for (int i = 1; i < s.length() / 2; i++) {
                if (s.substring(i, 2 * i).equals(s.substring(0, i))) {
                    System.out.printf("#%d %d\n", tc, i);
                    break;
                }
            }
        }
        sc.close();
    }
}
