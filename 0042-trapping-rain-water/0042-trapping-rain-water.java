class Solution {
    public int trap(int[] height) {
        int n=height.length;

        //Left Max Boundary- Array
        int LeftMax[]=new int[height.length];
        LeftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            LeftMax[i]=Math.max(height[i],LeftMax[i-1]);

        }
        //Right Max boundary
        int RightMax[]=new int[height.length];
        RightMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RightMax[i]=Math.max(height[i],RightMax[i+1]);
        }

        int TrappedWater=0;
        //loop
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(LeftMax[i],RightMax[i]);
            TrappedWater+=(waterlevel-height[i]);
        }
        return TrappedWater;
        
    }
}