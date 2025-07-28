class Solution {
    public String numberToWords(int num) {
        if(num == 0){
            return "Zero";
        }
        String[] thousands = new String[]{"Thousand","Million","Billion"};
        String result = numberToWordshelper(num%1000);
        num = num/1000;
        if(num > 0 && num%1000 > 0){
            result = numberToWordshelper(num%1000)+ " Thousand " + result;
        }
        num = num /1000;
        if(num > 0 && num%1000 > 0){
            result = numberToWordshelper(num%1000)+ " Million " + result;
        }
        num = num /1000;
        if(num > 0 && num%1000 > 0){
            result = numberToWordshelper(num%1000)+ " Billion " + result;
        }
        return result.trim();
    }
    static String numberToWordshelper(int num){
        String[] digit = new String[]{"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] teens = new String[]{"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String[] tens = new String[]{"Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
        String result = "";
        if(num > 99){
            result += digit[num/100-1] + " Hundred " ;
        }
        num = num % 100;
        if(num > 9 && num < 20){
            result += teens[num-10]+ " ";
        }
        else {
            if(num > 19){
            result += tens[num/10-2] + " ";
            num = num % 10;
        }
        if(num > 0){
            result += digit[num-1] + " ";
        }
        }
        return result.trim();
    }
}