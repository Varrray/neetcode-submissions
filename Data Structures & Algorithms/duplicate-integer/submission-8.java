class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ans=new HashSet<>();
        for(int i:nums){
            ans.add(i);
        }
        return nums.length!=ans.size();
        
    }
}