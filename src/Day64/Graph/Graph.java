package Day64.Graph;
import java.util.* ;
public class Graph {
    int V ;
    ArrayList<ArrayList<Integer>>list ;
    Graph(int V){
        this.V = V ;
        list = new ArrayList<>();
        for(int i = 0 ; i<V ; i++){
            list.add(new ArrayList<>());
        }
    }
    void addEdge(int u , int v){
        list.get(u).add(v);
        list.get(v).add(u);
    }
    void bfs(int start){
        boolean[]visited = new boolean[V];
        Queue<Integer>q = new LinkedList<>();
        visited[start]=true ;
        q.add(start);
        while(!q.isEmpty()){
            int node = q.poll();
            System.out.println(node);
           for(int neighbor : list.get(node)){
               if(!visited[neighbor]){
                   visited[neighbor]=true ;
                   q.add(neighbor);
               }
           }
        }
    }
    void dfs(int start , boolean[]visited){
        visited[start]=true ;
        System.out.println(start + " ");
        for(int neighbor : list.get(start)){
            if(!visited[neighbor])
            dfs(neighbor , visited);
        }
    }
}
