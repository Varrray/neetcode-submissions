class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0;
        int r=0;
        Set<Integer> window=new HashSet<>();
        int n=nums.length;
        while(r<n){
            if(r-l>k){
                window.remove(nums[l]);
                l++;
            }
            if(window.contains(nums[r])){return true;}

            window.add(nums[r]);
            r++;
        }
        return false;
    }
}