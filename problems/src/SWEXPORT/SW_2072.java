package SWEXPORT;

import java.io.FileInputStream;
import java.util.Scanner;

public class SW_2072 {
    public static void main(String args[]) throws Exception
    {

        System.setIn(new FileInputStream("./src/2072.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();



        for(int test_case = 1; test_case <= T; test_case++)
        {
            int sum = 0;
            for(int i=0;i <10; ++i) {
                int tmp = sc.nextInt();
                if(tmp%2!=0) {
                    sum+=tmp;
                }
            }
            System.out.printf("#%d %d%n",test_case,sum);
        }
    }
}