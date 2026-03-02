class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<>();
        int startRow=0;
        int endRow=matrix.length-1;
        int startcol=0;
        int endcol=matrix[0].length-1;

        while(startRow<=endRow&&startcol<=endcol){
            //top
            for(int j=startcol;j<=endcol;j++){
                result.add(matrix[startRow][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                result.add(matrix[i][endcol]);
            }
            //bottom
            for(int j=endcol-1;j>=startcol;j--){
                if(startRow==endRow){
                    break;
                }
                result.add(matrix[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startcol==endcol){
                    break;
                }
                result.add(matrix[i][startcol]);
            }
            startRow++;
            endRow--;
            startcol++;
            endcol--;
        }
        System.out.println();
        return result;
    }
}
