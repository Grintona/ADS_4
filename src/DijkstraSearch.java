import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraSearch {

    private HashMap<String, Integer> distances;
    private HashMap<String, String> previousVertices;

    public DijkstraSearch(WeightedGraph graph, String startVertex) {
        distances = new HashMap<>();
        previousVertices = new HashMap<>();
        dijkstra(graph, startVertex);
    }
    public void dijkstra(WeightedGraph graph, String startVertex) {
        PriorityQueue<Vertex> priorityQueue = new PriorityQueue<>((a, b) -> a.distance - b.distance);
        for (String vertex : graph.adjacencyList.keySet()) {
            distances.put(vertex, Integer.MAX_VALUE);
        }
        distances.put(startVertex, 0);
        priorityQueue.add(new Vertex(startVertex, 0)
        );
        while (!priorityQueue.isEmpty()) {
            Vertex currentVertex = priorityQueue.poll();
            for (Map.Entry<String, Integer> neighbor :
                    graph.adjacencyList.get(currentVertex.name).entrySet()) {
                String nextVertex = neighbor.getKey();
                int edgeWeight = neighbor.getValue();
                int newDistance = distances.get(currentVertex.name) + edgeWeight;
                if (newDistance < distances.get(nextVertex)) {
                    distances.put(nextVertex, newDistance);
                    previousVertices.put(nextVertex, currentVertex.name);
                    priorityQueue.add(new Vertex(nextVertex,newDistance));
                }
            }
        }
    }

    public void printShortestPath(String endVertex) {
        System.out.println("Shortest distance: " + distances.get(endVertex));
        printPath(endVertex);
    }

    private void printPath(String currentVertex) {
        if (previousVertices.containsKey(currentVertex)) {
            printPath(previousVertices.get(currentVertex));
        }
        System.out.print(currentVertex + " ");
    }

    static class Vertex {
        String name;
        int distance;
        public Vertex(String name,  int distance) {
            this.name = name;
            this.distance = distance;
        }
    }
}