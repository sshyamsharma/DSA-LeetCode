class Solution {
    public void rotate(int[] arr, int k) {
       int n = arr.length;
       k = k % n;
       int left = 0;
       int right = n-k-1;
       while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }
       left = n-k;
       right = n-1;
       while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }
       left = 0;
       right = n-1;
       while(left < right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
       }


    }
}