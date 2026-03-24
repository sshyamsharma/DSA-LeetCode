class Solution {
    public int maxSubArray(int nums[]){
        int n = nums.length;
        int currentsum = 0;
        int Maximum_sum = nums[0];
        for(int i = 0;i<n;i++){
            currentsum += nums[i];
            Maximum_sum = Math.max(Maximum_sum , currentsum);

            if(currentsum < 0){
                currentsum = 0;
            }
        }
        return Maximum_sum;

    }
    
}