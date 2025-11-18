class Solution {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff_arr = new int[n];
        for(int i=0;i<bookings.length;i++){
            int l = bookings[i][0];
            int r = bookings[i][1];
            int diff = bookings[i][2];
            diff_arr[l-1]+=diff;
            if(r<n){
                diff_arr[r]-=diff;
            }
        }
        int[] res = new int[n];
        int sum = 0;
        for(int i=0;i<res.length;i++){
            sum+=diff_arr[i];
            res[i]=sum;
        }
        return res;
        
    }
}