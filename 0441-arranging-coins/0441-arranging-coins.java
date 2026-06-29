class Solution {
     static int sqrt(long n){
        long start = 1;
        long end = n;
        while(start <= end){
            long mid = start + (end - start)/2;
            if(mid == n / mid){
                return (int)mid;
            }else if(mid > n / mid){
                end  = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return (int)end;
    }
    public int arrangeCoins(int n) {
        return (sqrt(8L*n+1) - 1)/2;
    }
}