package Graphs;

import java.util.*;

public class GraphBFS {
    private int V;
    private int[][] matrix;

    GraphBFS(int V) {
        this.V = V;
        matrix = new int[V][V];
    }

    void addEdge(int u, int v) {
        matrix[u][v] = 1;
        matrix[v][u] = 1;
    }

    void BFS(int start) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<>();

        visited[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i = 0; i < V; i++) {
                if (matrix[node][i] == 1 && !visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }

    public static void main(String[] args) {
        GraphBFS g = new GraphBFS(6);
        g.addEdge(0, 5);
        g.addEdge(0, 3);
        g.addEdge(1, 5);
        g.addEdge(2, 4);
        g.addEdge(3, 0);
        g.addEdge(1, 4);
        g.addEdge(4, 1);
        g.addEdge(4, 2);
        g.addEdge(5, 1);
        g.addEdge(5, 0);
        g.addEdge(3, 0);
        g.BFS(0);
    }
}