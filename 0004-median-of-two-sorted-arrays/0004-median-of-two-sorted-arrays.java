class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		if(nums1.length<nums2.length) {
			return bs(nums1,nums2);
		}
		else {
			return bs(nums2,nums1);
		}

	}
	public static double bs(int[] main,int[] sub) {
		int lo=0;
		int hi=main.length;
		int n1=main.length;
		int n2=sub.length;
		int total = (n1+n2+1)/2;
		int odd=n1+n2;
		double ans=0.00;
		while(lo<=hi) {
			int mid1=lo+(hi-lo)/2;
			int mid2=total-mid1;
			int l1=Integer.MIN_VALUE;
			int l2=Integer.MIN_VALUE;
			int r1=Integer.MAX_VALUE;
			int r2=Integer.MAX_VALUE;
			
			if(mid1-1>=0) {l1=main[mid1-1];}
			if(mid2-1>=0) {l2=sub[mid2-1];}
			
			if(mid1<n1) {r1=main[mid1];}
			if(mid2<n2) {r2=sub[mid2];}
			
			if(l1<=r2 && l2<=r1) {
				//for odd
				if(odd%2==1) {
					return Math.max(l1,l2);
				}
				ans = (double)((Math.max(l1, l2)+Math.min(r1, r2))/2.0);
				return ans;
			}
			else if(l1>r2) {
				hi=mid1-1;
			}
			else {
				lo=mid1+1;
			}
		}
		return ans;
}
}