package SWEXPORT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 달팽이는 1부터 N까지의 숫자가 시계방향으로 이루어져 있다. 다음과 같이 정수 N을 입력 받아 N크기의 달팽이를 출력하시오.
 * <p>
 * 1. N 값을 입력 받는다.
 * 2. N x N 크기의 정수 이차원 배열을 만든다
 * 3. N x N 크기의 참 거짓 이차원 배열을 만든다
 * 4. 우, 하, 좌, 상으로 욺직이기 때문에 움직임에 맞혀 행렬 배열을 추가한다
 * 5. n의 크기는 N x N 크기를 넘을수는 없다.
 * 5. 꺽여야 하는 순간이 오면 방향이 바뀌어야됨
 * 5.
 */

public class sw_1954 {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("./src/1961.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int tc = 1; tc <= T; tc++) {

        }
    }
}
