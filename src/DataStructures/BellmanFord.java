package DataStructures;

	import java.util.Arrays;

	public class BellmanFord {
	    private int vertices;
	    private int[] distance;

	    public BellmanFord(int vertices) {
	        this.vertices = vertices;
	        this.distance = new int[vertices];
	        Arrays.fill(distance, Integer.MAX_VALUE);
	    }

	    public void shortestPath(int[][] graph, int source) {
	        distance[source] = 0;

	        // Relax all edges V-1 times
	        for (int i = 0; i < vertices - 1; i++) {
	            for (int j = 0; j < vertices; j++) {
	                for (int k = 0; k < vertices; k++) {
	                    if (graph[j][k] != 0 && distance[j] != Integer.MAX_VALUE && distance[j] + graph[j][k] < distance[k]) {
	                        distance[k] = distance[j] + graph[j][k];
	                    }
	                }
	            }
	        }

	        // Check for negative-weight cycles
	        for (int j = 0; j < vertices; j++) {
	            for (int k = 0; k < vertices; k++) {
	                if (graph[j][k] != 0 && distance[j] != Integer.MAX_VALUE && distance[j] + graph[j][k] < distance[k]) {
	                    System.out.println("Graph contains negative-weight cycle");
	                    return;
	                }
	            }
	        }

	        // Print the shortest distances
	        printSolution(source);
	    }

	    private void printSolution(int source) {
	        System.out.println("Vertex\t\tDistance from Source");
	        for (int i = 0; i < vertices; i++) {
	            System.out.println(i + "\t\t" + distance[i]);
	        }
	    }

	    public static void main(String[] args) {
	        int[][] graph = {
	                {0, 4, 0, 0, 0, 0, 0, 8, 0},
	                {4, 0, 8, 0, 0, 0, 0, 11, 0},
	                {0, 8, 0, 7, 0, 4, 0, 0, 2},
	                {0, 0, 7, 0, 9, 14, 0, 0, 0},
	                {0, 0, 0, 9, 0, 10, 0, 0, 0},
	                {0, 0, 4, 14, 10, 0, 2, 0, 0},
	                {0, 0, 0, 0, 0, 2, 0, 1, 6},
	                {8, 11, 0, 0, 0, 0, 1, 0, 7},
	                {0, 0, 2, 0, 0, 0, 6, 7, 0}
	        };

	        int vertices = graph.length;
	        BellmanFord bellmanFord = new BellmanFord(vertices);
	        int source = 0;
	        bellmanFord.shortestPath(graph, source);
	    
	}
}
