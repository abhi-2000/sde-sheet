import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..\
        
        
          int col0 = 1, rows = matrix.length, cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }

        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }
    }
}
//         int res[][]=new int[matrix.length][matrix[0].length];
//         int n=matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 res[i][j]=matrix[i][j];
  
                
//             }
//         }
//         boolean colDel=false,rowDel=false;
//             for (int i = 0; i < n; i++) {

//             for (int j = 0; j < m; j++) {
//                 if (matrix[i][j] == 0)
//                     colDel = rowDel = true; //See if we have to delete the
//                                             //current row and column
//                 if (rowDel == true){
//                     res[i] = new int[m];
//                     rowDel = false;
//                 }
//                 if(colDel == true){
//                     for (int k = 0; k < n; k++) {
//                         res[k][j] = 0;
//                     }
//                     colDel = false;
//                 }

//             }

        
        
        
// //         for(int i=0;i<matrix.length;i++)
// //         {
// //             for(int j=0;j<matrix[0].length;j++)
// //             {
// //                 if(matrix[i][j]==0)
// //                 {
// //                     for(int k=0;k<matrix[0].length;k++)
// //                     {
// //                         arr[i][k]=0;
// //                     }
// //                     for(int k=0;k<matrix.length;k++)
// //                     {
// //                         arr[k][j]=0;
// //                     }

// //                 }
// //                 else if(arr[i][j]!=0)
// //                     arr[i][j]=matrix[i][j];
// //             }
// //         }
//             }
//             for(int k=0;k<matrix.length;k++)
//             {
//                     for(int l=0;l<matrix[0].length;l++)
//                     {
//                         matrix[k][l]=res[k][l];
//                     }

                
//             }
        
        
//     }

// }
