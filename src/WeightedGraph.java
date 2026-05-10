import java.util.HashMap;

public class WeightedGraph {

    public HashMap<String, HashMap<String, Integer>> adjacencyList;

    public WeightedGraph() {adjacencyList = new HashMap<>();}

    public void addVertex(String vertex) {
        adjacencyList.put(vertex, new HashMap<>());
    }

    public void addEdge(String source, String destination, int distance) {
        adjacencyList.get(source).put(destination, distance);
        adjacencyList.get(destination).put(source, distance);
    }
    public void printGraph() {
        for (String vertex : adjacencyList.keySet()) {

            System.out.println(vertex + " -> " + adjacencyList.get(vertex));
        }
    }
}