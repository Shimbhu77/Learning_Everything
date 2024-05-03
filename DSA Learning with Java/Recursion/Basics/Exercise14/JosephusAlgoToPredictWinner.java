public class JosephusAlgoToPredictWinner {

    public static void main(String[] args) {
        int ans = josePhus(5, 3);
        System.out.println(ans);
    }

    public static int josePhus(int n,int k)
    {
        if(n==1)
        {
            return 0;
        }

        return (josePhus(n-1, k)+k)%n;
    }
}