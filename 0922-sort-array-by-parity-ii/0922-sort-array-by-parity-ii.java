class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int start = 0;
        int end = nums.length-1;
        for(int i=0; i<nums.length; i++){
            if(nums[start] %2 == 0){
                start++;
            }
            else{
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                end--;
            }
        }
        start = 1;
        end = nums.length-2;
        while(start < end){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start = start + 2;
                end = end-2;
        }
        return nums;
    }
}