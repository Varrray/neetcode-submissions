class Solution {
    public int solve(int i,String s,int[] cache){
        if(i==s.length()){return 1;}
        if(s.charAt(i)=='0'){return 0;}
        if(cache[i]!=-1){return cache[i];}
        int res=solve(i+1,s,cache);
        if((i+1< s.length()) && (s.charAt(i)=='1' || (s.charAt(i)=='2' && s.charAt(i+1)<'7')) ){
            res+=solve(i+2,s,cache);
        }
return cache[i]=res;
    }
    public int numDecodings(String s) {
        int n=s.length();
        int[] cache=new int[n+1];
        Arrays.fill(cache,-1);
        return solve(0,s,cache);
        
    }
}
