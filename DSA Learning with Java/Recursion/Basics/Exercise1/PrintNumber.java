public class PrintNumber {
    // 1000 
    // 998
    // 996
    // ...
    // 4
    // 2

    public static void main(String[] args) {
        int n = 20;
        int sum = 0;
        int n2 = 19;
        // recursiveEvenNumber(n);
        recursiveEvenNumberSum(n,sum);
        recursiveOddNumberSum(n2,sum);

    }
    
    
    // printing even number
    static void recursiveEvenNumber(int n)
    {
        if(n==2)
        {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        recursiveEvenNumber(n-2);
    }
    // printing odd number
    static void recursiveOddNumber(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return;
        }

        System.out.println(n);
        recursiveOddNumber(n-2);
    }



    // printing sum of even number
    static void recursiveEvenNumberSum(int n,int sum)
    {
        if(n==2)
        {
            sum += n;
            System.out.println(" inside if :: n : "+n+", sum : "+sum);
            return;
        }
        
        sum += n;
        System.out.println("n : "+n+", sum : "+sum);
        recursiveEvenNumberSum(n-2,sum);
    }
    // printing sum of odd number
    static void recursiveOddNumberSum(int n,int sum)
    {
        if(n==1)
        {
            sum += n;
            System.out.println(" inside if :: n : "+n+", sum : "+sum);
            return;
        }

        sum += n;
        System.out.println("n : "+n+", sum : "+sum);
        recursiveOddNumberSum(n-2,sum);
    }
}
