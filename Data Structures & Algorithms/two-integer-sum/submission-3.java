class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            ans.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            int diff=target-nums[i];
            if(ans.containsKey(diff) && ans.get(diff)!=i){
                return new int []{i,ans.get(diff)};
            }
        }
        return new int[0];
    }
}
