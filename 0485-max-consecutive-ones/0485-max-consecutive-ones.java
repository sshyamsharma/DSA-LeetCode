class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int j = 0;
        int n = nums.length;
        int max = 0;
        int current_count = 0;
        while(j < n){
            if(nums[j] == 1){
                current_count++;
            }else{
                max = Math.max(current_count,max);
                current_count = 0;
            }
            j++;
        }
        return Math.max(max,current_count);
    }
}