public class CheckNumberIsPrime {
    public static void main(String[] args) {
        int num = 97;
        System.out.println(isPrime(num, 2, num-1));
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
}
