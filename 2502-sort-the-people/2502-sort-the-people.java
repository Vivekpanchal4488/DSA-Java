class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = heights.length;
        for(int i = 0; i<n; i++){
            for(int j =i+1; j<n; j++){
                if(heights[j] > heights[i]){
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                    int tem = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tem;
                }
            }
        }
        return names;
    }
}