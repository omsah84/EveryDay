import java.util.*;

public class MainGraph {
    //edge object
    static class Edge{
        int src;
        int des;

        public Edge(int s, int d){
            this.src = s;
            this.des = d;
        }
    }


   static void createGraph( ArrayList<Edge> graph[]){

        for(int i = 0 ;i<5;i++){
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 0));
        graph[1].add(new Edge(0, 0));
        graph[2].add(new Edge(0, 0));

   }


   static void printGraph(ArrayList<Edge> graph[]){
    for(int j=0;j<graph.length;j++){

        for(int i = 0;i<graph[j].size();i++){
            Edge e = graph[j].get(i);
            
            System.out.print(e.des+" ");
            
        }
        System.out.println();
    }
    
   }
    public static void main(String[] args) {
        ArrayList<Edge> graph[] = new ArrayList[5];
        
        createGraph(graph);
        printGraph(graph);
    }
}
