class Solution {
    public int[] countBits(int n) {
        if(n==0) return new int [] {0};
       ArrayList<Integer> dp=new ArrayList<>(Collections.nCopies(n+1, 0));
       dp.set(1,1);
        for(int i=2;i<=n;i++){
            if(i%2==0){
                dp.set(i,dp.get(i/2));
            }else{
                dp.set(i,dp.get(i/2)+1);
            }
        }
        int[] result = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            result[i] = dp.get(i);
        }
        return result;
    }
}