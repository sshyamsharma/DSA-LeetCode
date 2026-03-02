class Solution {
    public int largestRectangleArea(int[] heights) {
        int largestArea = 0;
        int nsr[] = new int[heights.length];
        int nsl[] = new int[heights.length];

        //next Smaller Right
        Stack<Integer> stack = new Stack<>();
        for(int i = heights.length-1; i>=0 ;i--){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsr[i] = heights.length;
            }else{
                nsr[i] = stack.peek();
            }
            stack.push(i);
        }
        // next Smaller left
        stack = new Stack<>();
        for(int i = 0; i<heights.length;i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                nsl[i] = -1;
            }
            else{
                nsl[i] = stack.peek();
            }
            stack.push(i);
        }
        //currArea
        for(int i = 0;i<heights.length;i++){
            int height = heights[i];
            int width = nsr[i] - nsl[i] -1;
            int currArea = height * width;

            largestArea = Math.max(currArea , largestArea);
        }
        return largestArea;
        
    }
    
    
}