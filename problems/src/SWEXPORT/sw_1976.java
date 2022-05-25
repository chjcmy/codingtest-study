package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 두개의 시각을 받고 둘이 더한 시각을 출력하라
 *
 * 1. 둘의 시, 분을 각각 받는다.
 * 2. 시각을 더 한뒤 12 으로 나눈 나머지 값을 넣는다
 * 3. 분을 더 한뒤 60 으로 나눈 나머지 값을 넣는다
 * 4. 마지막으로 시, 분을 출력한다.
 */

public class sw_1976 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1976.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {
            int firstHour = sc.nextInt();
            int firstMinute = sc.nextInt();
            int secondHour = sc.nextInt();
            int secondMinute = sc.nextInt();

            int totalHour = firstHour + secondHour;
            int totalMinute = firstMinute + secondMinute;

            if( totalMinute > 60 ) {
                totalMinute -= 60;
                totalHour++;
            }
            if( totalHour > 12 ) totalHour -= 12;

            System.out.println("#"+ tc + " " + totalHour + " " + totalMinute);

        }
    }
}
