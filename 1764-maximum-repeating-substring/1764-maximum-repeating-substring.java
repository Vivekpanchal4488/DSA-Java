class Solution {
    public int maxRepeating(String sequence, String word) {
        int count = 0;
        String add = word;
        while(sequence.contains(add) == true){
            count++;
            add += word;
        }
        return count;
    }
}