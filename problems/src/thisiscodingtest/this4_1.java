package thisiscodingtest;

/**
 * L R U D 값을 받고 목적지 위치를 알아 내라
 * <p>
 * 제한 사항 : 사용자는 행렬 판을 넘어 서는 안된다
 * 1. "U"나 "L" 일때 0 이하 이면 안고 "R"나 "D" 일경우는 맵의 최대를 넘어서는 안된다
 * 2. "U"일경우 M에 -1 을 더하고,"D"일경우 M에 1을 더한다
 * 3. "L"일경우 N에 -1 을 더하고, "R"을 N에 1을 더한다
 * 4. 마지막에는 N 과 M 을 푼다
 */

public class this4_1 {
    public static void main(String[] args) {
        int maps = 5;
        String moves[] = {"R", "R", "R", "U", "D", "D"};
        int M = 0;
        int N = 0;

        for (int i = 0; i < moves.length; i++) {
            if ("U".equals(moves[i])) {
                if (M > 0) {
                    M--;
                }
            } else if ("D".equals(moves[i])) {
                if (M < maps) {
                    M++;
                }
            } else if ("R".equals(moves[i])) {
                if (N < maps) {
                    N++;
                } else if ("L".equals(moves[0])) {
                    if (N > 0) {
                        N--;
                    }
                }
            }
        }
        System.out.printf("%d %d", M+1, N+1);
    }
}
