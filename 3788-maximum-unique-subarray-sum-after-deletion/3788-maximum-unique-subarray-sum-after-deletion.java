class Solution {
    public int maxSum(int[] nums) {
        Set <Integer> unique = new HashSet<>();
        int result = 0;
        int maxnegative = Integer.MIN_VALUE;
        for( int i = 0; i<nums.length; i++){
            if( nums[i] > 0){
                unique.add(nums[i]);
            }
            else{
                maxnegative = Math.max(maxnegative, nums[i]);
            }
        }
        for(int num : unique){
            result += num;
        }
        return result == 0? maxnegative : result;
    }
}