class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(i < nums.length-1 && nums[i] > nums[i+1]){
                count++;
            }
            else if(i == nums.length-1 && nums[nums.length-1] > nums[0]){
                count++;
            }
        }
        return (count > 1) ? false : true;
    }
}