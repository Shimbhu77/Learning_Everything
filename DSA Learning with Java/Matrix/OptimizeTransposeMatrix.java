import java.util.Arrays;

public class OptimizeTransposeMatrix {
    
     public static void main(String[] args) {
        int n=3;
        int[][] matrix = new int[n][n];
        int count = 1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                matrix[i][j] = count;
                count++;
            }
        }

        System.out.println("Matrix");

        for(int[] arr : matrix)
        {
            System.out.println(Arrays.toString(arr));
        }

        int[][] mat = transposeMatrixMethod(matrix);

        System.out.println("Transpose Matrix");

        for(int[] arr : mat)
        {
            System.out.println(Arrays.toString(arr));
        }

    }

    public static int[][] transposeMatrixMethod(int[][] matrix)
    {
        int n = matrix.length;

        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        return matrix;
    }
}
