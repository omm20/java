import java.util.*;
public class pathExists {
    static class edge{
        int src; 
        int dest; 
        int wt;

        public edge(int s, int d, int w){
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }
    static void createGraph(ArrayList<edge>[] graph){
        for(int i=0; i<graph.length; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0,1,1));
        graph[0].add(new edge(0,2,1));

        graph[1].add(new edge(1,0,1));
        graph[1].add(new edge(1,3,1));

        graph[2].add(new edge(2,0,1));
        graph[2].add(new edge(2,4,1));

        graph[3].add(new edge(3,1,1));
        graph[3].add(new edge(3,4,1));
        graph[3].add(new edge(3,5,1));

        graph[4].add(new edge(4,2,1));
        graph[4].add(new edge(4,3,1));
        graph[4].add(new edge(4,5,1));

        graph[5].add(new edge(5,3,1));
        graph[5].add(new edge(5,4,1));
        graph[5].add(new edge(5,6,1));
       
        graph[6].add(new edge(6,5,1));

    }
    static boolean hasPath(ArrayList<edge>[] graph, int src, int dest, boolean[] vis) {
        if(src==dest){
            return true;
        }
        vis[src] = true;
        for(int i=0; i<graph[src].size(); i++){
            edge e = graph[src].get(i);
            // e.dest == neightbour;
            if(!vis[e.dest] && hasPath(graph, e.dest,dest,vis)){
                return true;
            }
        }
        return false;
    }
public static void main(String args[]){
    int v=7;
    ArrayList<edge>[] graph = new ArrayList[v];

    createGraph(graph);
    //System.out.println(hasPath(graph,0,8,new boolean[v]));
    System.out.println(hasPath(graph,0,8,new boolean[v]));

}
}
