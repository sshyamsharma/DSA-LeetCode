class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;
        for(int i = 0;i<n;i++){
            if(nums[i] == 0){
                count_zero++;
            }else if(nums[i] == 1){
                count_one++;
            }else{
                count_two++;
            }
        }
        int i = 0;
        while(count_zero > 0){
            nums[i] = 0;
            i++;
            count_zero--;
        }
        while(count_one > 0){
            nums[i] = 1;
            i++;
            count_one--;
        }
        while(count_two > 0){
            nums[i] = 2;
            i++;
            count_two--;
        }
    }
}