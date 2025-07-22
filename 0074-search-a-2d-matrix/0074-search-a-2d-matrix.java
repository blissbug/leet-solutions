class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(target<matrix[0][0] || target>matrix[matrix.length-1][matrix[0].length-1]){
            return false;
        }
        int lo = 0;
		int hi = matrix.length-1;
		int r = -1;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(target>=matrix[mid][0]) {
				lo=mid+1;
				r=mid;
			}
			else {
				hi=mid-1;
			}
		}
		if(r==-1) {
            //not possible to have lesser than first index
			return false;
		}
        //check in the column
		lo = 0;
		hi = matrix[0].length-1;
		while(lo<=hi) {
			int mid = lo + (hi-lo)/2;
			if(target==matrix[r][mid]) {
                //early return if found
				return true;
			}
			else if(target>matrix[r][mid]) {
				lo = mid+1;
			}
			else {
				hi=mid-1;
			}
		}
		return false;
    }
}