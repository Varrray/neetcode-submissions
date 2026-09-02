class Solution {
    public int solve(int i,int[] nums,int n,int[] cache){
        if(i>=n){return 0;}
        if(cache[i]!=-1){return cache[i];}
        int inc=nums[i]+solve(i+2,nums,n,cache);
        int exc=0+solve(i+1,nums,n,cache);
        return cache[i]=Math.max(inc,exc);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] cache;
        cache=new int [n+1];
        Arrays.fill(cache,-1);
        
        int ans =solve(0,nums,n,cache);
        return ans;
        
    }
}
