class Solution {
    public int solve(int n , int i,int[] cache){
        if(i==n){
            return 1;
        }
        if(i>n){return 0;}
        if(cache[i]!=-1){return cache[i];}
        return cache[i]=solve(n,i+1,cache)+solve(n,i+2,cache);
    }
    public int climbStairs(int n) {
        int[] cache;
        cache=new int[n+1];
        Arrays.fill(cache,-1);
        int ans=solve(n,0,cache);
        return ans;
        
    }
}
