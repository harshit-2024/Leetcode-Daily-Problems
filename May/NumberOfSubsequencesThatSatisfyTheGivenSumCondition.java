import java.util.*;

class NumberOfSubsequencesThatSatisfyTheGivenSumCondition {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        if(nums[0]>target){
            return 0;
        }
        int n = nums.length;
        int mod = 1000000007;
        int[] pow = new int[n+1];
        pow[0] = 1;
        for(int i=1;i<=n;i++){
            pow[i] = (pow[i-1]*2)%mod;
        }
        int res = 0;
        int s = 0, e = n-1;
        while(s<=e){
            if(nums[s]+nums[e]>target){
                e--;
            }
            else{
                int power = e - s;
                res = ((res%mod) + (pow[power]%mod))%mod;
                s++;
            }
        }
        return res;
    }
}

/*
 * Time Complexity: O(N*logN)
 * Space Complexity: O(N)
 */