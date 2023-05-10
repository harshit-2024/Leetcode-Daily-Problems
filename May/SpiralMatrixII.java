import java.util.*;

public class SpiralMatrixII {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        int row = matrix.length;
        int col = matrix[0].length;
        int n = row*col;
        int i, j = 0;
        int rs = 0, cs = 0, re = row-1, ce = col-1;
        while(j<n){
            i=cs;
            while(i<=ce && j<n){
                ans.add(matrix[rs][i]);
                i++;
                j++;
            }
            rs++;
            i = rs;
            while(i<=re && j<n){
                ans.add(matrix[i][ce]);
                i++;
                j++;
            }
            ce--;
            i = ce;
            while(i>=cs && j<n){
                ans.add(matrix[re][i]);
                i--;
                j++;
            }
            re--;
            i = re;
            while(i>=rs && j<n){
                ans.add(matrix[i][cs]);
                i--;
                j++;
            }
            cs++;
        }
        return ans;
    }
}

/*
 * Time Complexity: O(N*N)
 * Space Complexity: O(N*N)
 */