package 프로그래머스;

public class 행렬회전하기 {
    int[][] arr;
    int[] dx = {0,1,0,-1};
    int[] dy = {1,0,-1,0};

    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int [queries.length];
        arr = new int[rows+1][columns+1];
        int x = 1;
        //행렬 만들기
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                arr[i][j] = x++;
            }
        }
        //
        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            int row = q[2]-q[0]; //행의 수
            int col = q[3]-q[1]; //열의 수
            int[] dir = {col, row, col, row};

            answer[i] = move(dir,q[0] , q[1]);
        }
        return answer;
    }

    public int move(int[] dir , int x, int y) {
        int min=Integer.MAX_VALUE;
        int before = arr[x][y];
        int after;
        int x1 = x;
        int y1 = y;
        for (int i = 0; i < dx.length; i++) {
            for (int j = 0; j < dir[i]; j++) {
                int tx = dx[i] + x1 ;
                int ty = dy[i] + y1 ;
                after = arr[tx][ty];
                arr[tx][ty] = before;
                before = after;

                x1 = tx;
                y1 = ty;

                min = Math.min(min, arr[tx][ty]);
            }
        }
        return min;
    }
}
