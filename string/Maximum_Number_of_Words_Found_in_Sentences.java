class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(String s:sentences)
        {
            String[] count =s.split(" ") ;
            max=Math.max(count.length,max);
        }
        return max;
    }
}
