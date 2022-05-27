package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.Scanner;

/**
 * 엔코딩 될걸 표에 맞게 디코딩 하라
 *
 * 1. 테스트 케이스 int 로 받는다
 * 2. 엔코딩된 스트링을 encode 변수에 저장한다
 * 3. 엔코딩 된 스트링을 decoding을 시켜서 decode 변수에 저장한다
 */

public class sw_1928 {
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
        System.setIn(new FileInputStream("./src/1928.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= T; i++) {
            String encode = sc.nextLine();
            String decode = new String(Base64.getDecoder().decode(encode));
            System.out.printf("#%d %s\n", i, decode);
        }
    }
}