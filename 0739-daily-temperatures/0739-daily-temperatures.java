class Solution {
    public int[] dailyTemperatures(int[] t) {
        Stack<Integer> s = new Stack<>();
        int result[] = new int[t.length];
        for(int i = 0;i<t.length;i++){
            while(!s.isEmpty() && t[s.peek()] < t[i]){
                int previndex = s.pop();
                result[previndex] = i - previndex;
            }
            s.push(i);
        }
        return result;
    }
}