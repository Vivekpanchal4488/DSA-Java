class Solution {
    public int reverse(int x) {
        int rev = 0;
        int num = x;
        while( num != 0){
            int digit = num % 10; // last digit
            num = num / 10; // remove last number
            if( rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)){
                return 0;
            }
            if( rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)){
                return 0;
            }
            rev = rev * 10 + digit;
        }
        return rev;
    }
}