class Solution {
    public int minCost(String colors, int[] neededTime) {
        int result = 0;
        char[] a = colors.toCharArray();
        int max = 0; 
        for(int i = 1; i < a.length; ++i){
            if(a[max] == a[i]){
                result += Math.min(neededTime[max], neededTime[i]);
                if(neededTime[max] < neededTime[i]) max = i; 
            }
            else max = i; 
        }
        return result;
    }
}
