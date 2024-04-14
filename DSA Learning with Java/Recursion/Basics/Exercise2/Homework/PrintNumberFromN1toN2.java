public class PrintNumberFromN1toN2 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 17;
        printNumber(n1, n2);

    }

    static void printNumber(int n1,int n2)
    {
        if(n1 == n2 )
        {
            System.out.println(n1);
            return;
        }

        System.out.println(n1);
        printNumber(n1+1, n2);
    }
}
