class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] newarray=new int[2*n];
        for(int i=0;i<n;i++){
            newarray[i]=nums[i];
        }
        for(int i=n;i<2*n;i++){
            newarray[i]=nums[i%n];
        }
     return newarray;   
    }
}