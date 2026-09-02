class Solution {
    public int solve(int[] nums,int i,int n,int [] cache){
        if(i>=n){return 0;}

        if(cache[i]!=-1){return cache[i];}
        int inc=nums[i]+solve(nums,i+2,n,cache);
        int exc=solve(nums,i+1,n,cache);
        return cache[i]=Math.max(inc,exc);

    }
    public int rob(int[] nums) {

        int[] cachea=new int[nums.length];
        int[] cacheb=new int[nums.length];
        Arrays.fill(cachea,-1);
        Arrays.fill(cacheb,-1);
        if(nums.length==0){return 0;}

        if(nums.length==1){return nums[0];}
        int zero=solve(nums,0,nums.length-1,cachea);
        int one=solve(nums,1,nums.length,cacheb);
        return Math.max(zero,one);


        
    }
}
