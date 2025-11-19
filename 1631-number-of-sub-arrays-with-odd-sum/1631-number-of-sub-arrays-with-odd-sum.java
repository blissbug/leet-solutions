class Solution {
    public int numOfSubarrays(int[] arr) {
        int even = 0;
        int odd = 0;
        long res = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum%2==0){
                even++;
                res+=odd;
            }
            else{
                odd++;
                res+=even;
                res++;
            }
        }
        return (int)(res % 1000000007);
    }
}