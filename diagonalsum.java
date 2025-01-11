package DSA;

public class diagonalsum {
    public static void main(String[] args) {
                    int matrix[][] = { {1,2,3,4},
                                       {5,6,7,8},
                                       {9,10,11,12},
                                       {13,14,15,16},
                                        };
                                       int result = sum(matrix);
                                       System.out.println(result);
                                        
                }
        
                public static int sum(int matrix[][]){
        
                    int sum = 0;
                      
                //     for (int i = 0; i < matrix.length; i++) {
                //     for (int j = 0; j < matrix[0].length; j++) {
                //         if (i == j) {
                //             sum += matrix[i][j];
                //         } else if (i + j == matrix.length - 1) {
                //             sum += matrix[i][j];
                //         }
                //     }
                // }
        
        
        
                //This was a brute force technique where T.C was O(n^2)
        
        
                for(int i=0; i<matrix.length;i++){
                    // primary diagonal
                    sum += matrix[i][i];
                    // secondary diaganal
                    if( i != matrix.length-1-i){
                        sum += matrix[i][matrix.length-1-i];
                    }
                }
                    return sum;
                }
        
}
