class Solution {
    public void setZeroes(int[][] matrix) {
        boolean r [] = new boolean [matrix.length];
        boolean c [] = new boolean [matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;                    
                }
            }
        }
        for(int i=0;i<r.length;i++){
            if(r[i]==true){
                for(int j=0;j<matrix[i].length;j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int i=0;i<c.length;i++){
            if(c[i]==true){
                for(int j=0;j<matrix.length;j++){
                    matrix[j][i] = 0;
                }
            }
        }
        return;
            
    }
}