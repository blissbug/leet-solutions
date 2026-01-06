class Solution {
    public int removeDuplicates(int[] arr) {
		int prev = 0;
		if(arr.length==1) {
		    return 1;
		}
		for(int curr=1;curr<arr.length;curr++ ) {
			if(arr[curr]!=arr[prev]) {
				arr[prev+1]=arr[curr];
				prev++;
			}
		}
		return prev+1;
    }
}