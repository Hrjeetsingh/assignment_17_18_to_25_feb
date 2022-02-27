//17 feb asignment 
//1.) Write a program to check for lower triangular matrix 
class Lower_triangular 
{ 
    int N = 4; 
   
    boolean isLowerTriangularMatrix(int mat[][]) 
    { 
        for (int i = 0; i < N; i++) 
            for (int j = i + 1; j < N; j++) 
                if (mat[i][j] != 0) 
                    return false; 
  
        return true; 
    } 
  
   
    public static void main(String args[]) 
    { 
        Lower_triangular ob = new Lower_triangular(); 
        int mat[][] = { { 1, 0, 0, 0 }, 
                        { 1, 4, 0, 0 }, 
                        { 4, 6, 2, 0 }, 
                        { 0, 4, 7, 6 } }; 
                          
        if (ob.isLowerTriangularMatrix(mat)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 

//2.) Find the sum of diagonal elements of a matrix 

class sumdiagonal{
    public static void main(String[] args) {
        int matrix[][]={{1,5,7},
                        {2,6,8},
                        {5,8,2}};
        int sum=0;
        int row=matrix.length;
        int col=matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if ((i + j) == col - 1 && (i==j)) {
                    sum += matrix[i][j];

                }
                //if(i==j){
                //    sum += matrix[i][j];
                //}
            }
        }
System.out.println(sum);
    }
}



//3.) Check whether the matrix is sparse.

class sparsemettix{
    public static void main(String[] args) {  
        int rows, cols, size, count = 0;  
          
        int a[][] = {{4, 0, 0},
                     {0, 5, 0},
                     {0, 0, 6}};  
            
          
        rows = a.length;  
        cols = a[0].length;  
        size = rows * cols;  
          
         
        for(int i = 0; i < rows; i++){  
            for(int j = 0; j < cols; j++){  
                if(a[i][j] == 0)  
                    count++;  
                }  
            }  
              
        if(count > (size/2)){  
            System.out.println("Given matrix is a sparse matrix");  
        }
        else  {
            System.out.println("Given matrix is not a sparse matrix");  
        }
    }  
}