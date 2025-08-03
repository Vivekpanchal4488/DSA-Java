class Solution {
    public int numberOfSteps(int num) {
        return helper(num, 0);
    }
    static int helper(int num, int c){
        if(num == 0){
            return c;
        }
        int rem = num%2;
        if(rem == 0){
            return helper(num/2 , c+1);
        }
        return helper(num-1, c+1);
    }
}