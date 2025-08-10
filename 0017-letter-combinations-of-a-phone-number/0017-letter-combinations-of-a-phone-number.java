class Solution {
    public List<String> letterCombinations(String digits) {
        if(digits.isEmpty()){
            return new ArrayList<>();
        }
        String[] map ={
            "",     // 0
            "",     // 1
            "abc",  // 2
            "def",  // 3
            "ghi",  // 4
            "jkl",  // 5
            "mno",  // 6
            "pqrs", // 7
            "tuv",  // 8
            "wxyz"  // 9
        };
        return combine("", digits,map);
    }
    static ArrayList<String> combine(String p, String up, String[] map){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digits = up.charAt(0)-'0';
        ArrayList<String> ans = new ArrayList<>();
        String letters = map[digits];
        for(int i =0; i<letters.length();i++){
            char ch = letters.charAt(i);
            ans.addAll(combine(p + ch, up.substring(1), map));
        }
        return ans;
    }
}