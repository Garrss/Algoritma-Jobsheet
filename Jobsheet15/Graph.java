package Jobsheet15;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class Graph {
    int vertex;
    LinkedList<Integer>[] list;
    boolean isDirected;

    public Graph(int vertex, boolean isDirected) {
        this.vertex = vertex;
        this.isDirected = isDirected;
        list = new LinkedList[vertex];
        for (int i = 0; i < vertex; i++) {
            list[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        list[source].addFirst(destination);
        if (!isDirected) {
            list[destination].addFirst(source);
        }
    }

    void degree(int source) throws Exception {
        if (isDirected) {
            int totalIn = 0, totalOut = list[source].size();
            for (int i = 0; i < vertex; i++) {
                if (i != source) {
                    for (int j = 0; j < list[i].size(); j++) {
                        if (list[i].get(j) == source) {
                            totalIn++;
                        }
                    }
                }
            }
            System.out.println("InDegree vertex " + source + " : " + totalIn);
            System.out.println("OutDegree vertex " + source + " : " + totalOut);
            System.out.println("Degree vertex " + source + " : " + (totalIn + totalOut));
        } else {
            System.out.println("Degree vertex " + source + " : " + list[source].size());
        }
    }

    void removeEdge(int source, int destination) throws Exception {
        list[source].remove((Integer) destination);
        if (!isDirected) {
            list[destination].remove((Integer) source);
        }
    }

    void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graph cleared");
    }

    void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + i + " connected with: ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(list[i].get(j) + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    static Scanner sc = new Scanner(System.in);

    static void menu() {
        System.out.println("1. Add edge");
        System.out.println("2. Degree");
        System.out.println("3. Remove edge");
        System.out.println("4. Remove all edges");
        System.out.println("5. Print graph");
        System.out.println("6. Exit");
    }

    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        System.out.println("Enter the number of vertices");
        int v = sc.nextInt();
        System.out.println("Enter 1 for directed graph and 0 for undirected graph");
        boolean isDirected = sc.nextInt() == 1;
        Graph graph = new Graph(v, isDirected);
        int choose;
        do {
            menu();
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    int source = rand.nextInt(v);
                    int destination = rand.nextInt(v);
                    graph.addEdge(source, destination);
                    break;
                case 2:
                    System.out.println("Enter the source");
                    source = sc.nextInt();
                    graph.degree(source);
                    break;
                case 3:
                    System.out.println("Enter the source and destination");
                    source = sc.nextInt();
                    destination = sc.nextInt();
                    graph.removeEdge(source, destination);
                    break;
                case 4:
                    graph.removeAllEdges();
                    break;
                case 5:
                    graph.printGraph();
                    break;
            }
        } while (choose != 6);
    }
}