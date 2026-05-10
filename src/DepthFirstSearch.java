import java.util.ArrayList;

public class DepthFirstSearch {

    private ArrayList<String> visitedVertices;

    public DepthFirstSearch(Graph graph, String startVertex) {

        visitedVertices = new ArrayList<>();

        DFS(graph, startVertex);
    }

    public void DFS(Graph G, String vertex) {

        visitedVertices.add(vertex);

        System.out.print(vertex + " ");

        for (String neighbor : G.adjacencyList.get(vertex)) {

            if (!visitedVertices.contains(neighbor)) {

                DFS(G, neighbor);
            }
        }
    }
}