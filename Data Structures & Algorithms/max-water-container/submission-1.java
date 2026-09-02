class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int area=0;
        while(l<r){
            if(heights[l]<heights[r]){
                int curr=heights[l]*(r-l);
                area=Math.max(area,curr);
                l++;
            }
            else{
                int curr=heights[r]*(r-l);
                area=Math.max(area,curr);
                r--;
            }
        }
        return area;
    }
}
