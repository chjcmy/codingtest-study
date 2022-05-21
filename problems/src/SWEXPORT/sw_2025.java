package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sw_2025 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/2025.txt"));

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int sum = 0;
        if (T <100000) {
            for(int tc=T; tc>=0; tc--) {
                sum += tc;
            }
        }
        System.out.println(sum);
    }
}
