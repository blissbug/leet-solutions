class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp=new int[nums1.length+1][nums2.length+1];
		for(int i=0;i<dp.length;i++) {
			Arrays.fill(dp[i], -1);
		}
		return noCross(nums1,nums2,0,0,dp);

	}
	public static int noCross(int[] arr1,int[] arr2,int i,int j,int[][] dp) {
		if(arr1.length==i || arr2.length==j) {
			return 0;
		}
		int count=0;
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		if(arr1[i]==arr2[j]) {
			count=1+noCross(arr1,arr2,i+1,j+1,dp);
		}
		int notTaken=Math.max(noCross(arr1,arr2,i+1,j,dp),noCross(arr1,arr2,i,j+1,dp));
		return dp[i][j]=Math.max(count, notTaken);
	}
}