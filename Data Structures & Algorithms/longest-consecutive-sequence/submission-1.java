class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int longest=0;
        for(int num:nums){
            if(!ans.contains(num-1)){
                int length=1;
                while(ans.contains(num+length)){
                    length++;
                }
                longest=Math.max(longest,length);
            }

        }
       return longest; 
    }
}
