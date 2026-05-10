import java.util.ArrayList;
import java.util.HashMap;

public class Graph {

    public HashMap<String, ArrayList<String>> adjacencyList;

    public Graph() {
       adjacencyList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(String vertex, String neighbor) {
        adjacencyList.get(vertex).add(neighbor);
    }

    public void printGraph() {
        for (String vertex : adjacencyList.keySet()) {
            System.out.println(vertex + " -> " + adjacencyList.get(vertex));
        }
    }
}