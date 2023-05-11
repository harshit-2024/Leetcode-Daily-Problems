public class UncrossedLines {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[][] ans = new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(nums1[i-1]==nums2[j-1]){
                    ans[i][j] = 1 + ans[i-1][j-1];
                }
                else{
                    ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
                }
            }
        }
        return ans[n1][n2];
    }
}

/*
 * Time Complexity: O(N1*N2)
 * Space Complexity: O(N1*N2)
 * N1 -> Length of nums1[]
 * N2 -> Length of nums2[]
 */