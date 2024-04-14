public class PowerOf2 {
    public static void main(String[] args) {
        int n = 7;
        int num = 3;

        System.out.println(powerOfNumber(num, n));

    }

    static int powerOfNumber(int num,int n)
    {
        if(n == 0)
        {
            return 1;
        }

        return num * powerOfNumber(num, n-1);
    }
}
