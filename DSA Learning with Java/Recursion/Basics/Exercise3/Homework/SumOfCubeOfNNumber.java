public class SumOfCubeOfNNumber {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(cubeSum(n));
        
    }

    static int cubeSum(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return (n*n*n)+cubeSum(n-1);
    }
}
