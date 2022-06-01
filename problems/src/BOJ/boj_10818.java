package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.util.Arrays.*;

//********************************
//해결 방법 : 먼저 들어온 N 이라는 정수를 이용하여 N에 맞게 배열을 만든 뒤
//           N의 수 만큼 배열에 값을 채워준 뒤 하나씩 비교하여 제일 큰 값을 저장한다
//           이 후 저장한 값을 출력한다
//********************************
public class boj_10818 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
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
