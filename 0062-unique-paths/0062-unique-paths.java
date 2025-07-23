class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		return getPaths(0,0,m-1,n-1,dp);
	}
	public static int getPaths(int r,int c,int m, int n,int[][] dp) {
		if(r==m && n==c) {
			return 1;
		}
		if(dp[r][c]!=-1) {
			return dp[r][c];
		}
		int right =0;
		int down = 0;
		if(r+1<=m) {
			right = getPaths(r+1,c,m,n,dp);
		}
		if(c+1<=n) {
			down = getPaths(r,c+1,m,n,dp);
		}
		return dp[r][c]=right+down;
	}
}