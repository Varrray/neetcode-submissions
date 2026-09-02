class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        for(int j=0;j<strs[0].length();j++){
            int c=0;
            char a=strs[0].charAt(j);
            for(int i=1;i<strs.length;i++)
            {
                if(j>=strs[i].length()){return ans;}
                if(a==strs[i].charAt(j)){c++;}
                

            }
            if(c==strs.length-1){
                ans=ans+a;
            }
            else return ans;
        }
        
return ans;
        
    }
}