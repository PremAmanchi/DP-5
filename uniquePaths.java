// tc : o(m*n)
// sc : o(m*n)

class Solution {
    public int uniquePaths(int m, int n) {
        int [][] memo = new int[m][n];
        memo[0][0]=1;
        for(int i =0 ; i < m ; i++){
            for (int j =0 ; j< n ; j++){
                if(i!=0) memo[i][j]+=memo[i-1][j];
                if(j!=0) memo[i][j]+=memo[i][j-1];
            }
        }
        return memo[m-1][n-1];
    }
}
