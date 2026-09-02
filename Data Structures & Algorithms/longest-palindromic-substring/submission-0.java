class Solution {
    int start=0,maxlen=1;
    public String longestPalindrome(String s) {
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                boolean t=solve(s,i,j);
            }
        }
        return s.substring(start,start+maxlen);
    }
    public boolean solve(String s,int i,int j){
        if(i>=j){return true;}
        boolean flag=false;
        if(s.charAt(i)==s.charAt(j)){
            flag=solve(s,i+1,j-1);
        }
        if(flag){
            int currlen=j-i+1;
            if(currlen>maxlen){
                maxlen=currlen;
                start=i;
            }
        }
        return flag;
    }
}