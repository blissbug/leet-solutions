class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res= new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        prev.add(1);
        res.add(prev);
        while(numRows-->1){
            List<Integer> curr = new ArrayList<>();
            curr.add(prev.get(0));
            for(int i=0;i<res.size()-1;i++){
                curr.add(prev.get(i)+prev.get(i+1));
            }
            curr.add(prev.get(prev.size()-1));
            res.add(curr);
            prev=curr;
        }
        return res;
    }
}