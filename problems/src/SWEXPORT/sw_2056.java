package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_2056 {

    public static void main(String args[]) throws FileNotFoundException {

        System.setIn(new FileInputStream("./src/2056.txt"));

        int daysOfMonth[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int tc=1; tc<=T; tc++) {
            String s = sc.next();
            int month = Integer.valueOf(s.substring(4,6));
            int day = Integer.valueOf(s.substring(6,8));
            String res = "-1";
            if( 1<=month && month<=12 && 1<=day && day<=daysOfMonth[month-1] ) {
                res = String.format("%s/%s/%s", s.substring(0,4), s.substring(4,6), s.substring(6,8));
            }
            System.out.format("#%d %s\n", tc, res);
        }
    }
}