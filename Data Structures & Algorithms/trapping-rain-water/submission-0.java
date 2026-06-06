class Solution {
    public int trap(int[] height) {
        int lmax=0;
        int rmax=0;
        int l=0;
        int r=height.length-1;
        int i=0;
        while(l<r){
            if(height[l]<height[r]){
                lmax=Math.max(height[l],lmax);
                i+=lmax-height[l];
                l++;
            }else{
                rmax=Math.max(height[r],rmax);
                i+=rmax-height[r];
                r--;
            }
            
            
        }
        return i;
        
    }
}
