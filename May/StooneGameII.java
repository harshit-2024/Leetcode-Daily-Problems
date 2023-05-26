public class StooneGameII {
    public int solve(int[] piles, int[][][] dp, boolean alice, int i, int m){
        if(i>=piles.length){
            return 0;
        }
        int bool = alice ? 1 : 0;
        if(dp[bool][i][m]!=0){
            return dp[bool][i][m];
        }

        int res = alice ? 0 : Integer.MAX_VALUE, total = 0;
        
        for(int x=1;x<=2*m;x++){
            if((i+x-1)>=piles.length){
                break;
            }
            total += piles[i+x-1];
            if(alice){
                res = Math.max(res, total + solve(piles, dp, !alice, i+x, Math.max(m, x)));
            }
            else{
                res = Math.min(res, solve(piles, dp, !alice, i+x, Math.max(m, x)));
            }
        }
        dp[bool][i][m] = res;
        return res;
    }
    public int stoneGameII(int[] piles) {
        int[][][] dp = new int[2][piles.length+1][piles.length+1];
        return solve(piles, dp, true, 0, 1);
    }    
}

/*
 * Time Complexity: O(N^3)
 * Space Complexity: O(N^2)
 */