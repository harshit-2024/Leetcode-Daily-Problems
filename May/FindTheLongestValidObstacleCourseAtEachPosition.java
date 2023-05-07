import java.util.*;

public class FindTheLongestValidObstacleCourseAtEachPosition {
    public int getIndex(ArrayList<Integer> list, int x){
        int n = list.size();
        int start = 0, end = n-1;
        while(start<=end){
            int mid = (start+end)/2;
            int num = list.get(mid);
            if(num>x){
                n = mid;
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return n;
    }
    public int[] longestObstacleCourseAtEachPosition(int[] obstacles) {
        int n = obstacles.length;
        int[] ans = new int[n];
        if(n==1){
            ans[0] = 1;
            return ans;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int cur = obstacles[i];
            if(list.size()==0){
                list.add(cur);
                ans[i] = list.size();
            }
            else{
                //get index of greater element
                int index = getIndex(list, cur);
                if(index<list.size()){
                    list.set(index, cur);
                }
                else{
                    list.add(cur);
                }
                ans[i] = index+1;
            }
        }
        return ans;
    }
}

/*
 * Time Complexity: O(N*logN)
 * Space Complexity: O(N)
 */