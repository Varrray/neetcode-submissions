class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen=new HashSet<>();
        for(int num:nums){
            seen.add(num);
        }
        if(seen.size()!=nums.length){return true;}
        return false;
    }
}