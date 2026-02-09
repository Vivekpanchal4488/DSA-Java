class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(digit(nums[i]) % 2 == 0){
                count++;
            }
        }
    return count;
    }
    int digit(int nums){
        int count = 0;
        while( nums > 0){
            nums = nums / 10;
            count++;
        }
        return count;
    }
}