package Graphs;

public class GraphDFS {
    private int V;
    private int[][] matrix;

    GraphDFS(int V) {
        this.V = V;
        matrix = new int[V][V];
    }

    void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    void DFSUtil(int node, boolean[] visited) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i = 0; i < V; i++) {
            if (matrix[node][i] == 1 && !visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    void DFS(int start) {
        boolean[] visited = new boolean[V];
        System.out.print("DFS: ");
        DFSUtil(start, visited);
    }

    public static void main(String[] args) {
        GraphDFS g = new GraphDFS(6);
        g.addEdge(0, 5);
        g.addEdge(0, 3);
        g.addEdge(1, 5);
        g.addEdge(2, 4);
        g.addEdge(1, 4);
        g.DFS(0);
    }
}