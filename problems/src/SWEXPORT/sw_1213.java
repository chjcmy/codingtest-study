package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 주어진 문장에 문자열이 몇개 들어 있는지 확인하라
 *
 * 1. 순서 정수를 받는다.
 * 2. 찾고 싶은 문자를 문자열 변수에 저장 시킨다.
 * 3. 문장을 받아 문자열 변수에 저장 시킨다.
 * 4. 0부터 문장의 길이 에 찾고 싶은 문자열의 길이를 빼서 반복문을 돌린다.
 * 5. 찾고 싶은 첫 문자가 같을 경우 찾고 싶은 문자 길이 만큼 for문을 돌린다.
 * 6. 다 맞게 있을경우 cnt 에 1을 더한다
 * 7. 마지막에 순서와 cnt 를 출력한다.
 */

public class sw_1213 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1213.txt"));

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            int combo = sc.nextInt();
            String finder = sc.next();
            String sentence = sc.next();
            int cnt = 0;

            for (int j = 0; j < sentence.length() - finder.length() + 1; j++) {
                if (sentence.charAt(j) == finder.charAt(0)) {
                    String someThing = sentence.substring(j, j+ finder.length());
                    if (someThing.equals(finder)) {
                        cnt++;
                    }
                }
            }
            System.out.printf("#%d %d\n", combo, cnt);
        }
    }
}
