class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> seen=new HashSet<>();
        for(int i:nums){
            seen.add(i);
        }
        // System.out.println(seen.size()+"-"+nums.length);
        if(seen.size()!=nums.length){
            return true;
        }
        return false;
    }
}