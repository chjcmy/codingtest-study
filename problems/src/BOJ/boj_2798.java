package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Arrays.sort;

public class boj_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int index = 0;
        int[] arr = new int[N];
        while(st.hasMoreTokens()) { // 토큰이 남아있으면 true, 비어있으면 false
            arr[index] = Integer.parseInt(st.nextToken());
            index++;
        }

        sort(arr);
        System.out.println(arr[0] + " " + arr[N - 1]);
    }
}