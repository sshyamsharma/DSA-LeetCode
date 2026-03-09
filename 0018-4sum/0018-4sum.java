class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i = 0;i<n-3;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1;j<n-2;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1;
                int t = n-1;
                while(k < t){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[t];
                    if(sum == target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k],nums[t]));
                        k++;
                        t--;
                        while(k < t && nums[k-1] == nums[k]) k++;
                        while(k < t && nums[t] == nums[t+1]) t--;
                    }else if(sum > target){
                        t--;
                    }else {
                        k++;
                    }
                }
            }
        }
        return res;
    }
}