package Day67;
import java.util.*;
public class CourseSchedule {
    class Solution {
        public boolean canFinish(int numCourses, int[][] prerequisites) {
            ArrayList<ArrayList<Integer>>graph = new ArrayList<>();
            for(int i = 0 ; i<numCourses ; i++){
                graph.add(new ArrayList<>());
            }
            //adding neighbors
            for(int[]p : prerequisites){
                graph.get(p[1]).add(p[0]);
            }
            //construct visited and pathvisited array
            boolean[]visited = new boolean[numCourses];
            boolean[]pathvisited = new boolean[numCourses];

            //do dfs
            for(int i = 0 ; i<numCourses ; i++){
                if(!visited[i]){
                    if(dfs(i,graph,visited,pathvisited)){
                        return false ;
                    }
                }
            }
            return true ;
        }

        private boolean dfs(int i, ArrayList<ArrayList<Integer>> graph, boolean[] visited, boolean[] pathvisited) {
            visited[i] = true;
            pathvisited[i] = true;
            for (int nbr : graph.get(i)) {
                if (!visited[nbr]) {
                    if (dfs(nbr , graph, visited, pathvisited))
                        return true;
                } else if (pathvisited[nbr])
                    return true;
            }
            pathvisited[i] = false;
            return false;
        }
    }
}
