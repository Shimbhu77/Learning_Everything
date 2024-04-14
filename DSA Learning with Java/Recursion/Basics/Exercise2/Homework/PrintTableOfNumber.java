public class PrintTableOfNumber {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        int num = 7;
        printTable(start, end, num);
    }

    static void printTable(int start,int end,int num)
    {
        if(start==end)
        {
            System.out.println(num*start);
            return;
        }

        System.out.println(num*start);

        printTable(start+1, end, num);
    }
}
