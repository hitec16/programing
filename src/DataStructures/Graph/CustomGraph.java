package DataStructures.Graph;

import java.util.LinkedList;

public class CustomGraph {

    static class Graph {
        int v;
        LinkedList<Integer>[] adjList;

        Graph(int v) {
            this.v = v;
            // define the size of array as
            // number of vertices
            adjList = new LinkedList[v];

            // Create a new list for each vertex
            // such that adjacent nodes can be stored
            for(int i = 0; i < v; i++){
                adjList[i] = new LinkedList<>();
            }
        }
    }

    static void addEdge(Graph graph, int src, int dest){
        // Add an edge from src to dest.
        graph.adjList[src].add(dest);
        // Since graph is undirected, add an edge from dest
        // to src also
        graph.adjList[dest].add(src);
    }

    // A utility function to print the adjacency list
    // representation of graph
    static void printGraph(Graph graph)
    {
        for(int v = 0; v < graph.v; v++)
        {
            System.out.println("Adjacency list of vertex "+ v);
            System.out.print("head");
            for(Integer pCrawl: graph.adjList[v]){
                System.out.print(" -> "+pCrawl);
            }
            System.out.println("\n");
        }
    }

    // Driver program to test above functions
    public static void main(String args[])
    {
        // create the graph given in above figure
        int V = 5;
        Graph graph = new Graph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);

        // print the adjacency list representation of
        // the above graph
        printGraph(graph);
    }
}
