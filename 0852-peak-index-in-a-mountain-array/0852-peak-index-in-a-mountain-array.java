class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int peak = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i] > arr[peak]){
                peak = i;
            }
        }
        return peak;
    }
}