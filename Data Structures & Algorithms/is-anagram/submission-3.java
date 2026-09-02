class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){return false;}
        HashMap<Character,Integer> si=new HashMap<>();
        HashMap<Character,Integer> ti=new HashMap<>();
        for(int i=0;i<s.length();i++){
            si.put(s.charAt(i),si.getOrDefault(s.charAt(i),0)+1);
            ti.put(t.charAt(i),ti.getOrDefault(t.charAt(i),0)+1);
        }
        return si.equals(ti);

    }
}
