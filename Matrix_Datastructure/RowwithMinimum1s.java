package Matrix_Datastructure;

public class RowwithMinimum1s {
    static int minRow(int [][] mat) {
        // code here
        int minimum = Integer.MAX_VALUE;
        int ansRow  = 1;
        int row = mat.length;
        int col = mat[0].length;
        for (int i = 0; i < row; i++){
            int count_ones = 0;
            for(int j=0; j < col ; j++) {
                if(mat[i][j] == 1) {
                    count_ones ++;
                }
            }
            if(count_ones < minimum) {
                minimum = count_ones;
                ansRow = i+1;
            }

        }
        return ansRow;
    }
    public static void main(String[]args){
        int [][] mat= {
            {1, 1, 1, 1}, {1, 1, 0, 0}, {0, 0, 1, 1}, {1, 1, 1, 1}
        };
        int ans = minRow(mat);
        System.out.print(ans);
    }
}
