class Solution {
    public int longestSubarray(int[] nums) {
        int largest = 0;
        for(int num : nums){
            largest = Math.max(num,largest);
        }
        int count = 0;
        int maxAns = 1;
        for(int num : nums){
            if(num == largest){
                count++;
                maxAns = Math.max(count, maxAns);
            }
            else{
                count = 0;
            }
        }
        return maxAns;
    }
}