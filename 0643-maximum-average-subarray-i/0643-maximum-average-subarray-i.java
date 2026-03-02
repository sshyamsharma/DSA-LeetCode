class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = k - 1;
        int sum = 0;
        for(int i = l;i<=r;i++){
            sum = sum + nums[i];
        }
        int Maxsum = sum;
        while(r<n-1){
            sum = sum - nums[l];
            l++;
            r++;
            sum = sum + nums[r];
            Maxsum = Math.max(Maxsum , sum);
        }
        return (double)Maxsum/k;
    }
}