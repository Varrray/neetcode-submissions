class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String ,List<String>> seen=new HashMap<>();
        for(String str:strs){
            int[] sum=new int[26];
            for(int i=0;i<str.length();i++){
                sum[str.charAt(i)-'a']++;
            }
            String key=Arrays.toString(sum);
            seen.putIfAbsent(key,new ArrayList<>());
            seen.get(key).add(str);
        }
        return new ArrayList<>(seen.values());
    }
}
