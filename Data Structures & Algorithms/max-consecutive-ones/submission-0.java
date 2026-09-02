class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count =0;
        int l=0,r=0;
        while(l<nums.length && r<nums.length){
            if(nums[r]==1){
                r++;
                count++;
            } 
            if( r<nums.length && nums[r]==0){
                maxi=Math.max(maxi,count);
                count =0;
                l=r;
                l++;
                r++;
            }
            if(r==nums.length){
                maxi=Math.max(maxi,count);
            }

        }
        return maxi;
    }
}