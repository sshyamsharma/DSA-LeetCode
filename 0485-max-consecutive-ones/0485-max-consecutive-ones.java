class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int max = 0;
        int current_count = 0;
        for(int i = 0 ;i<n;i++){
            if(nums[i] != 0){
                current_count++;
            }else{
                max = Math.max(current_count,max);
                current_count = 0;
            }
        }
        return Math.max(max,current_count);
    }
}