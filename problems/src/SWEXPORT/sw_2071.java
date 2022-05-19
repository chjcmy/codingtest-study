package SWEXPORT;

import java.io.FileInputStream;
import java.util.Scanner;

public class sw_2071 {
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("./src/2071.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            double sum = 0;
            for(int i=0;i <10; ++i) {
                double tmp = sc.nextInt();
                    sum+=tmp;
            }
            sum = sum / 10;
            System.out.printf("#%d %d%n",test_case,Math.round(sum));
        }
    }
}