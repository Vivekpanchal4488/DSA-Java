class Solution {
    public void sortColors(int[] nums) {
        int start = 0 ;
        int curr = 0;
        int end = nums.length-1;
        while(curr <= end){
            switch(nums[curr]){
                case 0:
                    swap(nums, start, curr);
                    start++;
                    curr++;
                    break;
                case 1:
                    curr++;
                    break;
                case 2:
                    swap(nums, curr, end);
                    end--;
                    break;
            }
        }
    }
        static void swap(int[] nums,int i,int j ){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}