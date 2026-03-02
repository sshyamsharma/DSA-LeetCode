class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int l = 0;
        int r = k-1;
        int sum = 0;
        for(int i = l;i<=r;i++){
            sum = sum + arr[i];
        }
        int count = 0;
        int avg = sum / k;
        if(avg >= threshold){
            count++;
        }
        while(r < n-1){
            sum = sum - arr[l];
            l++;
            r++;
            sum = sum + arr[r];
            avg = sum / k;
            if(avg>=threshold){
                count++;
            }
        }
        return count;
    }
}