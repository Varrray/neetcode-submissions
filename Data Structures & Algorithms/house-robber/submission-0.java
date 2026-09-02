class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] cache=new int[n+1];
        Arrays.fill(cache,-1);
        int ans=solve(nums,n,0,cache);
        return ans;
        
    }
    public int solve(int[] nums,int n,int i,int[] cache){
        if(i>=n){
            return 0;
        }
        if(cache[i]!=-1){return cache[i];}
        int inc=nums[i]+solve(nums,n,i+2,cache);
        int exc=0+solve(nums,n,i+1,cache);
        return cache[i]=Math.max(inc,exc);
    }
}
