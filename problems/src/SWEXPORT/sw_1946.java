package SWEXPORT;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 너비가 10인 여러줄의 문자열로 이루어져 있다 빈공간 없이 알파벳으로 채워져 있고 마지막줄은 왼쪽부터 채워져 있다
 * 이 무서를 압축한 문서는 알파벳과 그알파벳의 연속된 개수로 이루어진 쌍들이 나열 되어 있다
 * 압축된 문서를 입력 받아 원본 문서를 만드는 프로그램을 작성 하시오.
 *
 * 1. N의 값을 받는다
 * 2. N의 값 만큼 문자열 배열을 만들고, N의 값 만큼 정수 배열을 만든다.
 * 3. 각 들어오는 값을 문자열 배열과 정수 배열에 추가 한다.
 * 4. count 변수를 선언한다.
 * 5. N값 만큼 for 문을 돌리면서 문장열 배열을 나열하고 만약 count가 10이면 count를 0으로 초기화 하고 다음줄에 문자를 넣는다.
 * 6. 숫자배열 i 값이 0 이 되었을시 다음 값을 넣어준다.
 * 7.
 *
 * */

public class sw_1946 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1946.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int N = sc.nextInt();
            String[] str = new String[N];
            int[] num = new int[N];
            int count = 0;
            for (int i = 0; i < N; i++) {
                str[i] = sc.next();
                num[i] = sc.nextInt();
            }
            System.out.printf("#%d\n", tc);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < num[i]; j++) {
                    System.out.print(str[i]);
                    count++;
                    if (count == 10) {
                        System.out.println();
                        count = 0;
                    }
                }
            }
            System.out.println();
        }
    }
}
