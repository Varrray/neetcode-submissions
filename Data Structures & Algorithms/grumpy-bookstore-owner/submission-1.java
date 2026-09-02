class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int sum=0;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
            sum=sum+customers[i];
            }
            maxi=Math.max(maxi,sum);

        }
        for(int i=0;i<minutes;i++){
            if(grumpy[i]==1){
                sum=sum+customers[i];
                maxi=Math.max(maxi,sum);
            }
        }
        for(int i=minutes;i<customers.length;i++){
            if(grumpy[i]==1){sum=sum+customers[i];}
            if(grumpy[i-minutes]==1){sum=sum-customers[i-minutes];}
            maxi=Math.max(maxi,sum);

        }
        return maxi;
    }
}