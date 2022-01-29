package com.emmantoksjr.algorithms;

class Graph {
    private int numOfVertices;
    private boolean adjacencyMatrix[][];

    public Graph(int numOfVertices) {
        this.numOfVertices = numOfVertices;
        adjacencyMatrix = new boolean[numOfVertices][numOfVertices];
    }

    void addEdge(int i, int j) {
        adjacencyMatrix[i][j] = true;
        adjacencyMatrix[j][i] = true;
    }

    void removeEdge(int i, int j) {
        adjacencyMatrix[i][j] = false;
        adjacencyMatrix[j][i] = false;
    }

    // Print the matrix
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numOfVertices; i++) {
            s.append(i + ": ");
            for (boolean j : adjacencyMatrix[i]) {
                s.append((j ? 1 : 0) + " ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}

public class AdjacencyMatrix {
    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);

        System.out.print(g.toString());
    }
}
