class Solution {
    public int[] findOriginalArray(int[] changed) {
        int n = changed.length, j = 0;
        if (n % 2 == 1) return new int[]{};
        int[] ans = new int[n / 2];
        int[] cnt = new int[200005];
        
        for (int x : changed) cnt[x] += 1;
        for (int i = 0; i < 200005; i++) {
            // check if the count of number i is greater than 0
            if (cnt[i] > 0) {
                // number i exists, decrease by 1
                cnt[i] -= 1;
                // look for the doubled value
                if (cnt[i * 2] > 0) {
                    // doubled value exists, decrease by 1
                    cnt[i * 2] -= 1;
                    // add this number to ans
                    ans[j++] = i--;
                } else {
                    // cannot pair up, return []
                    return new int[]{};
                }
            }
        }
        return ans;
    }
}
