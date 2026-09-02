class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l=0, n=nums.length;
        while(l<=n){
            for(int r=l+1;r-l<=k;r++){
                if(r<n && nums[l]==nums[r] ){return true;}
            }
            l++;
            }
      return false;  
    }
}