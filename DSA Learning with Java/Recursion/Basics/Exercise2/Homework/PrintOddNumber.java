public class PrintOddNumber {
    public static void main(String[] args) {
        int n = 30;
        oddNumberFromNtoOne(n);
        System.out.println("-------------");
        oddNumberFromOnetoN(n,1);

    }

    static void oddNumberFromNtoOne(int n)
    {
       if(n==1)
       {
          System.out.println(n);
          return;
       }
       // System.out.println(n);
       if(n%2==1)
       {
          System.out.println(n); 
       }

       oddNumberFromNtoOne(n-1);
      
    }

    static void oddNumberFromOnetoN(int n,int start)
    {
       if(start==n)
       {
            if(start%2==1)
            {
                System.out.println(start); 
            }
            return;
       }
       // System.out.println(n);
       if(start%2==1)
       {
          System.out.println(start); 
       }

       oddNumberFromOnetoN(n,start+1);
      
    }

}
