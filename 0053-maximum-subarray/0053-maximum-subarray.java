class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxsub = nums[0];
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            if(sum > maxsub){
                maxsub = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxsub;
    }
}