class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count++;
            } 
        }
        return count;
    }
    static boolean even(int num){
        int numberofDigits = digits(num);
        if(numberofDigits%2 == 0){
            return true;
        }
        return false;
    }
    static int digits(int num){
        int count = 0;
        while(num > 0){
            count++;
            num = num/10;
        }
        return count;
    }
}