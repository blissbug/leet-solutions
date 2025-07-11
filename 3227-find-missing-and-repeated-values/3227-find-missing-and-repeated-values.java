class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        long a_sumn = 0;
        long a_sq_sumn = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                a_sumn+=grid[i][j];
                a_sq_sumn+=Math.pow(grid[i][j],2);
            }
        }
        long n = grid.length*grid.length;
        long sumn = ((n)*(n+1))/2;
        long sq_sumn = (n)*(n+1)*((2*n)+1)/6;
        
        long diff = a_sumn-sumn;
        long sum = (int)(a_sq_sumn- sq_sumn)/diff;

        int x = (int)(diff+sum)/2;
        int y = (int)(sum-diff)/2;

        int[] arr = new int[2];

        arr[0] = x;
        arr[1] = y;

        return arr;

    }
}