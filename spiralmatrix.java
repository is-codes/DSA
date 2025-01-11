package DSA;

public class spiralmatrix {
    public static void main(String[] args) {
                int matrix[][] = { {1,2,3,4},
                                   {5,6,7,8},
                                   {9,10,11,12},
                                   {13,14,15,16},
                                    };
                                    spiral(matrix);
            }
        
            public static void spiral(int matrix[][]){
                int startR = 0, startC = 0;
                int endR = matrix.length-1 , endC = matrix[0].length-1;
        
                while( startR <= endR && startC <= endC ){
                    // top
                    for(int j=startC;j<=endC;j++){
                        System.out.print(matrix[startR][j] + " ");
                    }
        
                    // right
                    for(int i=startR+1;i<=endR;i++){
                        System.out.print(matrix[i][endC]+ " ");
                    }
                    // bottom
                    for(int j=endC-1;j>=startC;j--){
                        if( startR == endR){
                            break;
                        }
                        System.out.print(matrix[endR][j]+ " ");
                    }
                    // left
                    for(int i=endR-1;i>=startR+1;i--){
                        if ( startC == endC ){
                            break;
                        }
                        System.out.print(matrix[i][startC] + " ");
                    }
        
                    startR++;
                    endR--;
                    startC++;
                    endC--;
        
            }
            System.out.println();
        
        }
        
    
    
}
