class Solution {
    public int solve(int[] nums,int i,int n,int [] cache){
        if(i>=n){return 0;}
        if(cache[i]!=-1){return cache[i];}
        int inc=nums[i]+solve(nums,i+2,n,cache);
        int exc=solve(nums,i+1,n,cache);
        return cache[i]=Math.max(inc,exc);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] cache=new int[nums.length];
        Arrays.fill(cache,-1);

        int ans=solve(nums,0,n,cache);
        return ans;  
    }
}
