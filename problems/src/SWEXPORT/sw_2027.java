package SWEXPORT;

import java.io.FileInputStream;
import java.util.Scanner;

public class sw_2027 {
    public static void main(String args[]) {
        int T = 0;
        for (int testCase = 0; testCase < 5; testCase++) {
            for (int testCase2 = 0; testCase2 < 5; testCase2++) {
                if (testCase == testCase2) {
                    System.out.print("#");
                } else {
                    System.out.print("+");
                }
            }
            System.out.println();
        }
    }
}

