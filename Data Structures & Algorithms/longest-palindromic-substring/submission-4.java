class Solution {
    int start=0,maxlen=1;
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                boolean t=solve(i,j,s);

            }
        }
        return s.substring(start,start+maxlen);
        
    }
    boolean solve(int i,int j,String s){
        boolean flag=false;
        if(i>=j){return true;}
        if(s.charAt(i)==s.charAt(j)){
            flag=solve(i+1,j-1,s);
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
