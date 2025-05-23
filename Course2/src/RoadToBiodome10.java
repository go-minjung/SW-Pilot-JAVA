import java.util.Stack;

// Stack 이용해 DFS 구현: 연결 식물 입력받아 연관관계 있는 그룹수 출력
public class RoadToBiodome10 {
    static final int MAX = 100;        // 최대 식물수 100
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("잘못된 입력입니다.");
            return;
        }

        // 인접 행렬 생성
        boolean[][] graph = new boolean[MAX+1][MAX+1];
        boolean[] visited = new boolean[MAX+1];

        // 연결 관계 저장
        for (String pair : args) {
            if (!pair.contains(",")) {
                System.out.println("연관 관계를 쉼표(,)로 구분해주세요.");
                return;
            }

            String[] parts = pair.split(",");
            try {
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);
                if (a<1 || a>MAX || b<1 || b>MAX) {
                    System.out.println("1~100 사이의 숫자를 입력해주세요.");
                    return;
                }

                // 양방향 연결
                graph[a][b] = true;
                graph[b][a] = true;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 입력입니다.");
                return;
            }
        }

        // DFS 그룹수 세기
        int groupCnt = 0;
        for (int i=1; i<=MAX; i++) {
            if (!visited[i]) {                  // 방문하지 않았고
                if (hasEdge(graph[i])) {        // 연결된 간선 있을 경우
                    dfs(graph, visited, i);     // DFS로 모든 연결 식물 탐색
                    groupCnt++;                 // 그룹수 +1
                }
            }
        }
        System.out.println(groupCnt);
    }

    // Stack 이용한 DFS
    static void dfs(boolean[][] graph, boolean[] visited, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);          // 시작 노드 push
        visited[start] = true;      // 시작 노드 방문 표시

        while (!stack.isEmpty()) {
            int cur = stack.pop();
            for (int i=1; i<=MAX; i++) {
                // 아직 방문하지 않았고 현재 노드와 연결된 노드 탐색
                if (!visited[i] && graph[cur][i]) {
                    visited[i] = true;
                    stack.push(i);      // 연결된 노드 push
                }
            }
        }
    }

    // 연결 여부 확인
    static boolean hasEdge(boolean[] row) {
        for (boolean connected : row) {
            if (connected) return true;
        }
        return false;
    }
}
