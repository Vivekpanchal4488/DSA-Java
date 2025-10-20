class Solution {
    public int maxProfit(int[] prices) {
        if( prices.length == 0){
            return 0;
        }
        int fb = Integer.MIN_VALUE;
        int sb = Integer.MIN_VALUE;
        int fs = 0;
        int ss = 0;

        for(int price : prices){
            fb = Math.max(fb, -price);
            fs = Math.max(fs, fb + price);
            sb = Math.max(sb, fs - price);
            ss = Math.max(ss, sb + price);
        }
        return ss;
    }
}