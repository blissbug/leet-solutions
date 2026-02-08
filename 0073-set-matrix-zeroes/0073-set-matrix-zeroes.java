class Solution {
    public void setZeroes(int[][] arr) {
        int col1 = -1;
		for(int i = 0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==0) {
					if(j==0) {
						col1=0;
					}
					else {
						arr[0][j]=0;
					}
					arr[i][0]=0;
				}
			}
		}
		for(int j=1;j<arr[0].length;j++) {
			if(arr[0][j]==0) {
				for(int i=0;i<arr.length;i++) {
					arr[i][j]=0;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i][0]==0) {
				for(int j=0;j<arr[0].length;j++) {
					arr[i][j]=0;
				}
			}
		}
		if(col1==0) {
			for(int i=0;i<arr.length;i++) {
				arr[i][0]=0;
			}
		}
    }
}