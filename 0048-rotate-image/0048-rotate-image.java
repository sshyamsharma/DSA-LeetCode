class Solution {
    public void rotate(int[][] arr) {
        //Tranpose
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        // Reverse Each Row
        for(int i = 0;i<arr.length;i++){
            int startCol = 0;
            int endCol = arr[0].length - 1;
            while(startCol < endCol){
                int temp = arr[i][startCol];
                arr[i][startCol] = arr[i][endCol];
                arr[i][endCol] = temp;
                startCol++;
                endCol--;
            }
        }
    }
}