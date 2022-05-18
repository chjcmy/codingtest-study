package BOJ;

// 문제 : a 가 b보다 큰 경우에는 '>' 를 출력한다
//        b 가 a 보다 클 경우 '<' 를 출력한다
//        a 와 b 가 같은 경우 '=' 를 출력한다

import java.util.Scanner;

public class boj_1330 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }
    }
}
