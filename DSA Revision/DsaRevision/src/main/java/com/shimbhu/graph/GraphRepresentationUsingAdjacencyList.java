package com.shimbhu.graph;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class GraphRepresentationUsingAdjacencyList {

    public static void main(String[] args) {

        int vertices = 5;
        int edges = 6;

        Map<Integer, List<Integer>> adjacencyList = new HashMap<>();
        Map<Integer, List<Edge>> adjacencyWeightedList = new HashMap<>();

        Scanner scanner = new Scanner(System.in);


        // undirected - unweighted graph

        for(int i=0;i<edges;i++)
        {
            int start = scanner.nextInt();
            int destination = scanner.nextInt();

            adjacencyList.computeIfAbsent(start, k -> new ArrayList<>());

            List<Integer> list = adjacencyList.get(start);
            list.add(destination);

            adjacencyList.put(start,list);
        }

        for(int i=0;i<vertices;i++)
        {
            System.out.println(i+" "+adjacencyList.get(i));
        }


        // undirected - weighted graph



        // directed - unweighted graph



        // directed - weighted graph



    }
}

class Edge
{
    Integer destination;
    Integer weight;

    Edge(){}

    public Edge(Integer destination,Integer weight)
    {
        this.destination = destination;
        this.weight = weight;
    }
}
