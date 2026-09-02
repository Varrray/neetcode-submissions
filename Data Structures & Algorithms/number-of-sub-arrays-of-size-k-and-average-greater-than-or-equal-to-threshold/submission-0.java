class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int l=0,n=arr.length;
        int ans=0;
        while(l<n-k+1){
            int sum=arr[l];
            for(int r=l+1;r-l<k && r<n;r++){
                sum=sum+arr[r];


            }
            if(sum/k>=threshold){ans++;}
            l++;
        }
       return ans; 
    }
}