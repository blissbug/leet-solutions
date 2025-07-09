class pair{
    int a;
    int b;
    public pair(int a,int b){
        this.a=a;
        this.b=b;
    }
}

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
		Stack<pair> st = new Stack<>();
		for(int i=0;i<intervals.length;i++) {
			if(st.size()==0) {
				st.add(new pair(intervals[i][0],intervals[i][1]));
			}
			else {
				int prev = st.peek().b;
				int curr = intervals[i][0];
				if(prev>=curr) {
					pair old = st.pop();
					old.b = Math.max(prev,intervals[i][1]);
					st.push(old);
				}
				else {
					st.push(new pair(intervals[i][0],intervals[i][1]));
				}
			}
		}
		int[][] res = new int[st.size()][2];
		int i=0;
		while(!st.empty()) {
			pair curr = st.pop();
			res[i][0] = curr.a;
			res[i][1] = curr.b;
            i++;
		}
        return res;
    }
}