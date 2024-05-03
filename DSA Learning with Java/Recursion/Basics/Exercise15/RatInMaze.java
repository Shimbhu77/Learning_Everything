import java.util.ArrayList;

public class RatInMaze {
    
    static int[] row = {-1,1,0,0};
    static int[] col = {0,0,-1,1};
    static String dir = "UDLR";
    public static void main(String[] args) {
        int n = 4;
        int[][] mat = {{1, 0, 0, 0},
        {1, 1, 0, 1}, 
        {1, 1, 0, 0},
        {0, 1, 1, 1}};

        int[][] visited = new int[n][n];

        ArrayList<String> ans = new ArrayList<>();

        // if(mat[i][j] == 0  || mat[n-1][n-1]==0)
        // {
        //     return ans;
        // }

        totalPath(mat, 0, 0, n, new StringBuilder(), ans, visited);

        for(String st : ans)
        {
            System.out.println(st);
        }

        // DDRDRR DRDDRR
    }

    public static void totalPath(int[][] matrix,int i,int j,int n, StringBuilder path, ArrayList<String> ans,int[][] visited)
    {
        if(i==n-1 && j==n-1)
        {
            ans.add(path.toString());
            return;
        }

        // first make element is visited

        visited[i][j]=1;
        
        for(int k=0;k<4;k++)
        {
            if(isValid(i+row[k],j+col[k],n) && matrix[i+row[k]][j+col[k]] == 1 && visited[i+row[k]][j+col[k]]==0)
            {
                path.append(dir.charAt(k));
                totalPath(matrix, i+row[k], j+col[k], n, path, ans, visited);
                path.deleteCharAt(path.length()-1);
            }
        }

        visited[i][j]=0;

    }

    public static boolean isValid(int i,int j,int n)
    {
        return i>=0 && j >=0 && i<n && j<n;
    }
}
