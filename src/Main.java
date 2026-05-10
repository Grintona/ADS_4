public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "C");
        graph.addEdge("A", "B");
        graph.addEdge("A", "D");

        graph.addEdge("B", "A");
        graph.addEdge("B", "C");
        graph.addEdge("B", "E");
        graph.addEdge("B", "G");

        graph.addEdge("C", "A");
        graph.addEdge("C", "B");
        graph.addEdge("C", "D");

        graph.addEdge("D", "C");
        graph.addEdge("D", "A");

        graph.addEdge("E", "G");
        graph.addEdge("E", "F");
        graph.addEdge("E", "B");

        graph.addEdge("F", "G");
        graph.addEdge("F", "E");

        graph.addEdge("G", "F");
        graph.addEdge("G", "B");
        graph.printGraph();
        new DepthFirstSearch(graph, "A");
        System.out.println("\n");
        new BreadthFirstSearch(graph, "A");
        System.out.println("\n");

        WeightedGraph graph1 = new WeightedGraph();
        graph1.addVertex("Glasgow");
        graph1.addVertex("Stirling");
        graph1.addVertex("Edinburgh");
        graph1.addVertex("Perth");
        graph1.addVertex("Dundee");
        graph1.addEdge("Glasgow", "Stirling", 50);
        graph1.addEdge("Glasgow", "Edinburgh", 70);
        graph1.addEdge("Stirling", "Perth", 40);
        graph1.addEdge("Stirling", "Edinburgh", 50);
        graph1.addEdge("Perth", "Edinburgh", 100);
        graph1.addEdge("Perth", "Dundee", 60);
        graph1.printGraph();
        System.out.println();
        DijkstraSearch search = new DijkstraSearch(graph1, "Edinburgh");
        search.printShortestPath("Dundee");

    }
}