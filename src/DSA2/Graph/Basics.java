package DSA2.Graph;

import java.util.ArrayList;

public class Basics {
    public static void main(String[] args) {
        int v = 4;
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            list.add(new ArrayList<Integer>());
        }
        addEdge(list,0,1);
        addEdge(list,0,3);
        addEdge(list,1,2);
        addEdge(list,2,3);
        print(list);
    }

    // Adjacency list implementation for Directed graph
    public static void addEdge(ArrayList<ArrayList<Integer>> adj,int u, int v) {
        adj.get(u).add(v);
    }

    // Adjacency list implementation for Undirected graph
    public static void addEdgeTwo(ArrayList<ArrayList<Integer>> adj,int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void print(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
