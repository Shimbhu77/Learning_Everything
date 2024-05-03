public class PredictWinner {
    public static void main(String[] args) {
        int[] arr = new int[8];

        int ans = predictWinner(arr, 8, 8, 8, 0);

        System.out.println(ans);

    }

    public static int predictWinner(int[] arr,int n, int k, int person_left,int idx)
    {
        if(person_left == 1)
        {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==0)
                {
                    return i;
                }
            }
        }

        int kill = (k-1)%person_left;

        while (kill>0) {
            idx = (idx+1)%n;

            while (arr[idx]==1) {
                idx = (idx+1)%n;
            }

            kill--;
        }

        arr[idx] = 1;

        while (arr[idx]==1) {
            idx = (idx+1)%n;
        }

        return predictWinner(arr, n, k, person_left-1, idx);
    }
}
