class Solution {
    public int findKthPositive(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end - start)/2;
            int correctNo = mid + 1;
            int missing = arr[mid] - correctNo;

            if(missing >= k){
                 end = mid -1;
            }else {
                start = mid + 1;
            }
        }
        return end + k+1;
    }
}