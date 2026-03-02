class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            
        }
        int leftsum=0;
        for(int i=0;i<nums.length;i++){
            leftsum=leftsum+nums[i];

            if(sum-leftsum==leftsum-nums[i]){
                return i;
            }

                
        }
         return -1;

        
    }
}