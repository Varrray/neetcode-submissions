class Solution {
    public int countSubstrings(String s) {
        int c=0;
        int n=s.length();
        int[][] cache= new int[n+1][n+1];
        for(int[] i:cache){
            Arrays.fill(i,-1);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(i,j,s,cache)){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean solve(int i,int j,String s,int[][] cache){
        if(i>=j){return true;}
        if(cache[i][j]!=-1){return cache[i][j]==1;}
        boolean flag=false;
        if(s.charAt(i)==s.charAt(j)){
            flag=solve(i+1,j-1,s,cache);
        }
        cache[i][j]=flag?1:0;
        return flag;
    }
}
