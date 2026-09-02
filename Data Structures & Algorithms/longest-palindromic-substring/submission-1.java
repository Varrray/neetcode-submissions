class Solution {
    int start=0,maxlen=1;
    public String longestPalindrome(String s) {
        int n=s.length();
        int [][] cache =new int[n+1][n+1];
        for (int[] i : cache) {
            Arrays.fill(i, -1);
        }
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                boolean t=solve(s,i,j,cache);
            }
        }
        return s.substring(start,start+maxlen);
    }
    public boolean solve(String s,int i,int j,int [][] cache){
        if(i>=j){return true;}
        if(cache[i][j]!=-1){return cache[i][j]==1;}
        boolean flag=false;
        if(s.charAt(i)==s.charAt(j)){
            flag=solve(s,i+1,j-1,cache);
        }
        if(flag){
            int currlen=j-i+1;
            if(currlen>maxlen){
                maxlen=currlen;
                start=i;
            }
        }
        cache[i][j] = flag ? 1 : 0;
        return flag;
    }
}