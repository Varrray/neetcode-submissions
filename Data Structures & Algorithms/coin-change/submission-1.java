class Solution {
    public int solve(int[] coins, int amount,int[] cache){
        if(amount==0){return 0;}
        if(cache[amount]!=-1){return cache[amount];}
        int mincoinsused=Integer.MAX_VALUE;
        for(int i=0;i<coins.length;i++){
            int coin=coins[i];
            if(coin<=amount){
                int ans= solve(coins,amount-coin,cache);
               int coinsused=1+ans;
               if(ans!=Integer.MAX_VALUE){
               mincoinsused=Math.min(mincoinsused,coinsused);
               }
            }
        }
        return cache[amount]=mincoinsused;
    }
    public int coinChange(int[] coins, int amount) {
        int[] cache=new int[amount+1];
        Arrays.fill(cache,-1);
        int ans=solve(coins , amount ,cache);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
        
    }
}
