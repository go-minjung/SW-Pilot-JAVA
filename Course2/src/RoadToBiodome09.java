import java.util.LinkedList;
import java.util.Queue;

// Queue 이용해 BFS 구현: (0,0)에서 (N-1,M-1)까지 최단거리 계산
public class RoadToBiodome09 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        // 2차원 정수 배열 grid 생성
        int N = args.length;
        int M = args[0].length();
        int [][] grid = new int[N][M];

        for (int i=0; i<N; i++) {
            String row = args[i];
            // 모든행 length가 M인지 검사
            if (row.length() != M) {
                System.out.println("잘못된 입력입니다.");
                return;
            }

            for (int j=0; j<M; j++) {
                char c = row.charAt(j);
                // 입력이 0 또는 1인지 검사
                if (c != '0' && c != '1') {
                    System.out.println("잘못된 입력입니다.");
                    return;
                }
                grid[i][j] = c - '0';   // 아스키코드 '0'은 48, '1'은 49
            }
        }

        // 시작점이나 도착점이 막혀있는 경우
        if (grid[0][0] == 0 || grid[N-1][M-1] == 0) {
            System.out.println("출구까지 안전한 경로가 없습니다.");
            return;
        }

        // BFS (Depth-First Search, 깊이 우선 탐색)
        boolean[][] visited = new boolean[N][M];    // 방문여부 저장
        int[][] dist = new int[N][M];               // 최단거리 저장
        Queue<int[]> queue = new LinkedList<>();    // BFS 큐

        visited[0][0] = true;           // 시작점 방문 표시
        dist[0][0] = 0;                 // 거리 1로 시작
        queue.offer(new int[]{0,0});    // 탐색할 좌표 큐에 offer: 시작점 (0,0)

        // 상하좌우 4방향 탐색
        int[] dx = {0, 0, -1, 1};   // 좌, 우
        int[] dy = {-1, 1, 0, 0};   // 상, 하

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1];

            if (x == N - 1 && y == M - 1) break;    // 출구인지 확인

            for (int d = 0; d < 4; d++) {
                int nx = x + dx[d], ny = y + dy[d];     // 상, 하, 좌, 우 순서
                if (nx>=0 && nx<N && ny>=0 && ny<M && !visited[nx][ny] && grid[nx][ny]==1) {
                    visited[nx][ny] = true;             // 방문 표시
                    dist[nx][ny] = dist[x][y] + 1;      // 현재 칸까지 거리+1
                    queue.offer(new int[]{nx, ny});     // 현재 위치에서 다시 탐색
                }
            }
        }

        // 최단경로 출력
        if (visited[N-1][M-1]) {
            System.out.println(dist[N - 1][M - 1]);
        } else {
            System.out.println("출구까지 경로가 없습니다.");
        }
    }
}
