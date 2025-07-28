class Solution {
    public String reverseVowels(String s) {
        // int[] freq = new int[26];
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length()-1;
        while(start < end){
            if(!isVowel(chars[start])){
                start++;
            }
            else if(!isVowel(chars[end])){
                end--;
            }
            else{
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;
                start++;
                end--;
            }
        }
        return String.valueOf(chars);
    }
    static boolean isVowel(char chars){
        if(chars == 'a' || chars == 'e' || chars == 'i' || chars == 'o' || chars == 'u' || chars == 'A' || chars == 'I'|| chars == 'E' || chars == 'O' || chars == 'U'){
            return true;
        }
        return false;
    }
    
}