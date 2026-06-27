class Solution {
    public int maximumCount(int[] nums) {
        int count_neg = 0;
        int count_pos = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] < 0){
                count_neg++;
            }else if(nums[i] > 0){
                count_pos++;
            }
        }
        return Math.max(count_neg,count_pos);
    }
}