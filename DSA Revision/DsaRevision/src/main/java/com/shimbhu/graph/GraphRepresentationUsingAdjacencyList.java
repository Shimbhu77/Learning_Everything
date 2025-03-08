package com.shimbhu.graph;

import java.util.Scanner;

public class GraphRepresentationUsingAdjacencyMatrix {

    public static void main(String[] args) {

        int vertices = 5;
        int edges = 6;

        int[][] adjMat = new int[vertices][vertices];


        // undirected - unweighted graph
        Scanner scanner = new Scanner(System.in);

        /*for(int i=0;i<edges;i++)
        {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adjMat[u][v] = 1;
            adjMat[v][u] = 1;
        }

        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print(adjMat[i][j]+" ");
            }

            System.out.println();
        }*/

        // undirected - weighted graph

        /*for(int i=0;i<edges;i++)
        {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int weight = scanner.nextInt();

            adjMat[u][v] = weight;
            adjMat[v][u] = weight;
        }

        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print(adjMat[i][j]+" ");
            }

            System.out.println();
        }*/

        // directed - unweighted graph

        /*for(int i=0;i<edges;i++)
        {
            int u = scanner.nextInt();
            int v = scanner.nextInt();

            adjMat[u][v] = 1;
        }

        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print(adjMat[i][j]+" ");
            }

            System.out.println();
        }*/

        // directed - weighted graph

        for(int i=0;i<edges;i++)
        {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int weight = scanner.nextInt();

            adjMat[u][v] = weight;
        }

        for(int i=0;i<vertices;i++)
        {
            for(int j=0;j<vertices;j++)
            {
                System.out.print(adjMat[i][j]+" ");
            }

            System.out.println();
        }

    }
}
