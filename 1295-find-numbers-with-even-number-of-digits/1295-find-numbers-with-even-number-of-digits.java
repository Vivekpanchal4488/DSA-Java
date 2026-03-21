class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(digits(nums[i]) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    public static int digits(int nums){
        int count = 0;
        while( nums > 0){
            nums = nums/10;
            count++;
        }
        return count;
    }
}