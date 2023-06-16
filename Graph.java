import java.util.*;

public class Graph {
    private int vertex;
    private List<List<Integer>> adjlist;

    Graph(int vertex){
        this.vertex = vertex;
        adjlist = new ArrayList<>(vertex);

        for(int i =0;i<vertex;i++){
            adjlist.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjlist.get(source).add(destination);
        // adjlist.get(destination).add(source);
    }

    public void printGraph(){
        for(int i =0;i<vertex;i++){
             System.out.print("Vertex " + i + " is connected to: ");
            for(Integer element : adjlist.get(i)){
                System.out.print(element+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();


        
    }
}
