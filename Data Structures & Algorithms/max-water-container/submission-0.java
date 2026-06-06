class Solution {
    public int maxArea(int[] heights) {
        int lmax=0;
        int rmax=0;
        int l=0;
        int r=heights.length-1;
        int i=0;
        while(l<r){
            if(heights[l]<heights[r]){
                i=Math.max(heights[l]*(r-l),i);
                l++;
            }else{
                i=Math.max(heights[r]*(r-l),i);
                r--;
            }
            
            
        }
        return i;
        
    }
}
