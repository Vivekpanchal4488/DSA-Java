class Solution {
    public int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;
        for(int i=0; i<nums.length; i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        while(start < end){
            int mid = start + (end - start) / 2;
            int sum = 0;
            int parts = 1;
            for(int i=0; i<nums.length; i++){
                if(sum + nums[i] > mid ){
                sum = nums[i];
                parts++;
            }
            else{
                sum += nums[i];
            }
            }
        if(parts > k){
            start = mid +1;
        }
        else{
            end = mid;
        }
        }
        return start;
    }
}