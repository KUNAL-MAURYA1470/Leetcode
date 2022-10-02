class Solution {
    public int numRollsToTarget(int n, int k, int target) {
        long[] curr= new long[target+1], prev = new long[target+1];
        long MOD =(long)1e9+7;
        prev[0]=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=k;j++){
                for(int val=0;val<=target;val++){
                    if(val-j>=0){
                        curr[val]+=prev[val-j];
                        curr[val]%=MOD;
                    }
                }
            }
            prev=curr.clone();
            Arrays.fill(curr,0);
        }
        return (int)(prev[target]%MOD);
    }
}