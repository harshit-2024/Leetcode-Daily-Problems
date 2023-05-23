import java.util.*;

public class MinimumNumberOfVerticesToReachAllNodes {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        return solve(n, edges);
    }
    List<Integer> solve(int n, List<List<Integer>> arr)
    {
        ArrayList<ArrayList<Integer>> graph=new ArrayList<>(n);
        List<Integer> ans=new ArrayList<>();
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.size();i++)
        {
            hs.add(arr.get(i).get(1));
        }
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(i))
            {
                ans.add(i);
            }
        }
        return ans;
    }
}
