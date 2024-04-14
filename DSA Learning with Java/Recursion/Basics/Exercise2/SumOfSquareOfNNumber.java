public class SumOfSquareOfNNumber {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(sumOfSquareNumber(n));
        
    }

    static int sumOfSquareNumber(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return (n*n)+sumOfSquareNumber(n-1);
    }
}
