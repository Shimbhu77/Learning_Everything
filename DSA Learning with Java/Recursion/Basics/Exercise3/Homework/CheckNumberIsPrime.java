public class CheckNumberIsPrime {
    public static void main(String[] args) {
        int num = 81;
        System.out.println(isPrime(num, 2, num-1));
        System.out.println(isPrimeFrom1toN(num, num, 0));
    }

    public static boolean isPrime(int num,int start,int end)
    {
        if(num%start == 0)
        {
            return false;
        }

        if(start==end)
        {
            return true;
        }

        return isPrime(num, start+1, end);
    }

    public static boolean isPrimeFrom1toN(int num,int k,int count)
    {
        if(count > 2)
        {
            return false;
        }
        
        if(count == 2 && k == 0 )
        {
            return true;
        }

        if(k == 0 )
        {
            return false;
        }

        if(num%k == 0)
        {
            count++;
        }

        return isPrimeFrom1toN(num, k-1, count);
    }
}
