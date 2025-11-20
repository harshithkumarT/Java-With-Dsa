package Matrix_Datastructure;

public class SearchA2DMatrix {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
//        System.out.println(n);
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[][]matrix =
                {
                        {
                            1,3,5,7
                        },
                        {
                            10,11,16,20
                        },
                        {
                            23 , 30, 36,60
                        }
                };
        int target = 3;
        System.out.println(searchMatrix(matrix,target));
        System.out.println(searchMatrixUsingBinarySearch(matrix,target));
    }
    public static boolean searchMatrixUsingBinarySearch(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int low = 0;
        int high  = row * col -1;
        while(low <= high) {
            int mid = (low+high) / 2;
            int r = mid/col;
            int c = mid% col;
            if(matrix[r][c] == target) {
                return true;
            }else if (matrix[r][c] > target) {
                high = mid-1;
            }
            else {
                low = mid + 1;
            }
        }
        return false;
    }
}
