class Solution {
    public int solve(int i,int n,int[] nums,int[] cache){
        if(i>=n){return 0;}
        if(cache[i]!=-1){return cache[i];}
        int inc=nums[i]+solve(i+2,n,nums,cache);
        int exc=0+solve(i+1,n,nums,cache);
        return cache[i]=Math.max(inc,exc);
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] cachea=new int[n];
        int[] cacheb=new int[n];
        Arrays.fill(cachea,-1);
        Arrays.fill(cacheb,-1);
        if(n==0){return 0;}
        if(n==1){return nums[0];}
        int first=solve(0,n-1,nums,cachea);
        int second=solve(1,n,nums,cacheb);
        return Math.max(first,second);
        
    }
}
