package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_2046 {
    public static void main(String args[]) throws FileNotFoundException {

        System.setIn(new FileInputStream("./src/2046.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        if (T <100000) {
            for(int tc=1; tc<=T; tc++) {
                System.out.print("#");
            }
        }
    }
}
