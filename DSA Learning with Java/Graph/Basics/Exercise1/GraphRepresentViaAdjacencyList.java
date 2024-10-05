import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GraphRepresentViaAdjacencyList {
    public static void main(String[] args) {
        
       Graph graph = new Graph();

       graph.addVertex(1);
       graph.addVertex(2);
       graph.addVertex(3);
       graph.addVertex(4);

       graph.addEdge(1, 2);
       graph.addEdge(2, 5);
       graph.addEdge(6, 2);
       graph.addEdge(3, 4);

       graph.printGraph();
    }
}


/**
 * Graph
 */
class Graph {

    Map<Integer,List<Integer>> adjacencyList;

    Graph()
    {
        this.adjacencyList = new HashMap<>();
    }

    public void addVertex(int vertex)
    {
        if(!adjacencyList.containsKey(vertex))
        {
            System.out.println("vertex : "+vertex+" added into the Graph");

            adjacencyList.putIfAbsent(vertex,new ArrayList<>());
        }
    }

    public void addEdge(int source,int destination)
    {
        if(!adjacencyList.containsKey(source))
        {
            addVertex(source);
        }

        if(!adjacencyList.containsKey(destination))
        {
            addVertex(destination);
        }
        
        System.out.println("Edge added between "+source+" and "+destination);

        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);

    }

    public void printGraph()
    {
        for(int key : adjacencyList.keySet())
        {
            System.out.println("Vertex : "+key+" ");

            for(int val : adjacencyList.get(key))
            {
                System.out.print(val+" ");
            }

            System.out.println();
        }
    }

}
