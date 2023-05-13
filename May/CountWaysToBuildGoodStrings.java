public class CountWaysToBuildGoodStrings {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod = 1000000007;
        int ans = 0;
        int[] dp = new int[high+1];
        dp[0] = 1;
        for(int i=1;i<=high;i++){
            if(i-zero>=0){
                dp[i] += dp[i-zero];
            }
            if(i-one>=0){
                dp[i] += dp[i-one];
            }
            dp[i] %= mod;
        }
        for(int i=low;i<=high;i++){
            ans = (ans+dp[i]) % mod;
        }
        return ans;
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * N -> high
 */