class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        HashMap<Character,Integer> seens=new HashMap<>();
        HashMap<Character,Integer> seent=new HashMap<>();
        for(int i=0;i<s.length();i++){
            seens.put(s.charAt(i),seens.getOrDefault(s.charAt(i),0)+1);
            seent.put(t.charAt(i),seent.getOrDefault(t.charAt(i),0)+1);
        }
        return seens.equals(seent);

    }
}
