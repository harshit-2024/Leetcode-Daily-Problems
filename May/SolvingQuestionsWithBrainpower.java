public class SolvingQuestionsWithBrainpower {
    public long solve(int[][] questions, int index, long[] dp){
        if(index>=questions.length){
            return 0;
        }
        long pick, nonpick;
        if(dp[index]!=0){
            return dp[index];
        }
        else{
            pick = questions[index][0] + solve(questions, index+1+questions[index][1], dp);
            nonpick = solve(questions, index+1, dp);
            dp[index] = Math.max(pick, nonpick);
        }
        return dp[index];
    }
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n];
        dp[0] = solve(questions, 0, dp);
        return dp[0];
    }
}

/*
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 * Recursive approach using Memoization
 */