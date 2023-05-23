import java.util.*;

class KthLargestElementInAStream {
    int k;
    int[] nums;
    PriorityQueue<Integer> q;

    public KthLargest(int k, int[] nums) {
        q = new PriorityQueue<>();
        this.k = k;
        this.nums = nums;
        for(int i=0;i<nums.length;i++){
            q.add(nums[i]);
        }
    }
    
    public int add(int val) {
        q.add(val);
        while(q.size()>k){
            q.poll();
        }
        return q.peek();
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */