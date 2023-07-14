package bfs_dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

class Graph {
    private int V;
    private LinkedList<Integer> adj[]; // 링크드리스트의 배열

    // constructor
    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        // v개의 LinkedList 선언 및 생성
        for (int i = 0; i < v; ++i) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) { // v번째 LinkedList 에 w를 삽입
        adj[v].add(w);
    }

    // DFS 함수
    void DFS(int v) { // v를 시작노드로!
        boolean visited[] = new boolean[V]; // 각 노드이 방문 여부를 저장하기 위해
        DFSUtil(v, visited);
    }

    // DFS에서 호출되는 함수
    void DFSUtil(int v, boolean visited[]) {
        // 현재 노드를 방문한 것으로 체크 (visited의 v번째 요소를 true로)
        visited[v] = true;
        System.out.println(v + " ");

        // 방문한 노드와 인접한 모든 노드를 가지고 온다
        Iterator<Integer> it = adj[v].listIterator();
        while (it.hasNext()) {
            int n = it.next();
            // 방문하지 않은 노드면 해당 노드를 다시 시작 노드로하여 DFSUtil을 호출
            if (!visited[n])
                DFSUtil(n, visited); // 재귀호출!
        }
    }

    void BFS(int s) {
        boolean visited[] = new boolean[V]; // 각 노드이 방문 여부를 저장하기 위해
        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            // 방문한 노드를 큐에서 추출하고 값을 출력
            s = queue.poll();
            System.out.println(s + " ");

            // 방문한 노드와 인접한 모든 노드를 가져온다.
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                // 방문하지 않은 노드면 방문한 것으로 표시하고 큐에 삽입
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }
}
public class Bj1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        Graph graph = new Graph(n);
        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine());
            graph.addEdge(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));
        }
        graph.DFS(v);
        graph.BFS(v);
    }
}
