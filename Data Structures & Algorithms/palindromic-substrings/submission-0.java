class Solution {
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(solve(i,j,s)){
                    c++;
                }
            }
        }
        return c;
    }
    public boolean solve(int i,int j,String s){
        if(i>=j){return true;}
        boolean flag=false;
        if(s.charAt(i)==s.charAt(j)){
            flag=solve(i+1,j-1,s);
        }
        return flag;
    }
}
