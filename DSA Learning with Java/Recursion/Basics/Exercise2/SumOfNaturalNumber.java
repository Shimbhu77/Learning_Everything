public class SumOfNaturalNumber {
    
    public static void main(String[] args) {
        int n = 100;
        System.out.println(sumOfNNaturalNumber(n));

    }

    static int sumOfNNaturalNumber(int n)
    {
        if(n==1)
        {
            return 1;
        }

        return n+sumOfNNaturalNumber(n-1);
    }
}
