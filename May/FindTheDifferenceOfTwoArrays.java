import java.util.*;

class FindTheDifferenceOfTwoArrays {
    public ArrayList<Integer> solve(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }
        HashSet<Integer> answer = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            int x = nums1[i];
            if(!set.contains(x) && !answer.contains(x)){
                ans.add(x);
                answer.add(x);
            }
        }
        return ans;
    }
    
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(solve(nums1, nums2));
        ans.add(solve(nums2, nums1));
        return ans;
    }
}

/*
 * Time Complexity: O(N+M)
 * Space Complexity: O(N+M)
 */