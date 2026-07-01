class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            if(nums[left]% 2 ==0){
                left++;
            }
            else{
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                right--;
            }
        }
         left = 1;
         right = nums.length-2;
        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right ] = temp;
            left = left + 2;
            right = right - 2;
        }
        return nums;
    }
}