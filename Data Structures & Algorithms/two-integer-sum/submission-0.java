class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> seen=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        
            seen.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(seen.containsKey(diff) && seen.get(diff)!=i){
                return new int[]{i,seen.get(diff)};

            }

        }

return new int[0];
        
    }
}
