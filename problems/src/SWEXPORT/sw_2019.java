package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_2019 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/2019.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 1;
        if (T <= 30) {
            System.out.print(sum + " ");
            for(int tc=1; tc<=T; tc++) {
                sum *= 2;
                System.out.print(sum + " ");
            }
        }
    }
}