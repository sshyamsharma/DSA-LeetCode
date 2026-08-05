class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> result=new ArrayList<>();
        int m = mat.length;
        int n = mat[0].length;
        int firstRow = 0;
        int lastRow = m - 1;
        int firstCol = 0;
        int lastCol = n - 1;
        while(firstRow <= lastRow && firstCol <= lastCol){
            //Right
            for(int j = firstCol;j<=lastCol;j++){
                result.add(mat[firstRow][j]);
            }
            firstRow++;
            if(firstRow > lastRow || firstCol > lastCol) break;
            //Down
            for(int i = firstRow;i<=lastRow;i++){
                result.add(mat[i][lastCol]);
            }
            lastCol--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            //left
            for(int j = lastCol;j>=firstCol;j--){
                result.add(mat[lastRow][j]);
            }
            lastRow--;
            if(firstRow > lastRow || firstCol > lastCol) break;
            for(int i = lastRow;i>=firstRow;i--){
                result.add(mat[i][firstCol]);
            }
            firstCol++;
        }
        return result;
    }
}
