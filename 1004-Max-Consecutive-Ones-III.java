class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int zero=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
            }
            while(zero>k){
                if(nums[l]==0){
                zero--;
            }
             l++;
            }
           max=Math.max(max,i-l+1);
        } 
        return max;
    }
   
}