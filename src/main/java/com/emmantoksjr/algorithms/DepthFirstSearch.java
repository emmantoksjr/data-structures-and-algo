package com.emmantoksjr.algorithms;

import java.util.*;

public class DepthFirstSearch {
    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(0,3);
        graph.addEdge(2,1);
        graph.addEdge(3,2);
        graph.addEdge(1,3);

        graph.DFS(0);
    }

    //Represents the graph node
    //Add adjList and visited array instance variables
    //Constructor takes in the number of vertices
    static class Graph {
        private LinkedList<Integer> adjList[];
        private boolean visited[];

        public Graph(int vertices) {
            adjList = new LinkedList[vertices];
            visited = new boolean[vertices];

            for (int i = 0; i < vertices; i++)
                adjList[i] = new LinkedList<Integer>();
        }

        void addEdge(int source, int destination) {
            adjList[source].add(destination);
        }

        //Takes in the starting vertex
        //Mark vertex as visited
        //Print out current Visited vertex
        //Visit all vertex neighbours
        //Create an iterator instance
        //Check if neighbour element has been previously visited
        void DFS(int vertex) {
            visited[vertex] = true;
            System.out.print(vertex + " ");

            Iterator<Integer> itr = adjList[vertex].iterator();

            while (itr.hasNext()) {
                int neighbour = itr.next();

                if (! visited[neighbour])
                    DFS(neighbour);
            }
        }
    }
}

