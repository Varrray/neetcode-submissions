class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            while(l<r && !isAlphanum(s.charAt(l))){
                l++;
            }
            while(r>l && !isAlphanum(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
                }
        
                l++;
                r--;
    }
    return true;
}
public boolean isAlphanum(char a){
            return (a>='a' && a<='z' || a >='A' && a<='Z' || a >='0' && a<='9');
                
    }   
}
