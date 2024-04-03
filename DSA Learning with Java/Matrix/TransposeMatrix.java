import java.util.Arrays;

public class TransposeMatrix {
    
    public static void main(String[] args) {
        int m=4,n=3;
        int[][] matrix = new int[m][n];
        int count = 1;
        for(int i=0;i<m;i++)
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
        int m = matrix.length;
        int n = matrix[0].length;

        int[][] transposeMatrix = new int[n][m];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }
}
