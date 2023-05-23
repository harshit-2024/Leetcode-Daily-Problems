import java.util.*;

public class IsGraphBipartite {
    public boolean isBipartite(int[][] graph) {
        return solve(graph);
    }
    boolean solve(int[][] graph)
    {
        int n=graph.length;
        int[] set=new int[graph.length];
        boolean[] visited=new boolean[n];
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                boolean flag=BFS(graph, i, visited, set);
                if(!flag)
                {
                    return false;
                }
            }
        }
        return true;
    }
    boolean BFS(int[][] graph, int s, boolean[] visited, int[] set)
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        visited[s]=true;
        set[s]=1;
        while(!q.isEmpty())
        {
            int u=q.poll();
            for(int i: graph[u])
            {
                if(visited[i] && set[u]==set[i])
                {
                    return false;
                }
                else if(!visited[i])
                {
                    visited[i]=true;
                    set[i]=(-1)*set[u];
                    q.add(i);
                }
            }
        }
        return true;
    }
}
