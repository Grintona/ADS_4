import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    private ArrayList<String> visitedVertices;

    public BreadthFirstSearch(Graph graph, String startVertex) {

        visitedVertices = new ArrayList<>();

        BFS(graph, startVertex);
    }

    public void BFS(Graph G, String startVertex) {

        Queue<String> queue = new LinkedList<>();

        visitedVertices.add(startVertex);

        queue.add(startVertex);

        while (!queue.isEmpty()) {

            String currentVertex = queue.poll();

            System.out.print(currentVertex + " ");

            for (String neighbor : G.adjacencyList.get(currentVertex)) {

                if (!visitedVertices.contains(neighbor)) {

                    visitedVertices.add(neighbor);

                    queue.add(neighbor);
                }
            }
        }
    }
}