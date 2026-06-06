class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] x={0,0};
        for (int i=0; i<= nums.length-2;i++){
            for(int j=i+1;j<=nums.length-1;j++){
                if(nums[i]+nums[j]==target){
                    x[0]=i;
                    x[1]=j;
                    return x;
                }
            }
        }
        return x;
        
    }
}
