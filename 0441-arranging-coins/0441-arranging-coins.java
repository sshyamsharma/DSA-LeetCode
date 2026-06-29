class Solution {
    public int arrangeCoins(int n) {
        long start = 0;
        long end = n;
        long ans = 0;
        while(start <= end){
            long k = start + (end - start)/2;
            long m = k*(k+1)/2;
            if(m == n) return (int)k;
            else if(m > n){
                end = k - 1;
            }
            else{
                ans = k;
                start = k + 1;
            }
        }
        return (int)(ans);
    }
}