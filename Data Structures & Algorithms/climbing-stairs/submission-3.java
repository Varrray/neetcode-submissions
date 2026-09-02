class Solution {
    public int solve(int i,int n,int[] cache){
        if(i==n){return 1;}
        if(i>n){return 0;}
        if(cache[i]!=-1){return cache[i];}
        return cache[i]=solve(i+1,n,cache)+solve(i+2,n,cache);
    }
    public int climbStairs(int n) {
        int[] cache;
        cache=new int[n+1];
        Arrays.fill(cache,-1);
        int ans=solve(0,n,cache);
        return ans;
        
    }
}
