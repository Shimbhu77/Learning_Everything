public class TowerOfHanoi {
    public static void main(String[] args) {
        towerOfHanoi(4, 1, 2, 3);
    }

    public static void towerOfHanoi(int n,int source,int helper,int destination)
    {

        if(n==1)
        {
            System.out.println("Disk moved from Rod "+source+" to "+destination);
            return;
        }

        towerOfHanoi(n-1, source, destination,helper);
        System.out.println("Disk moved from Rod "+source+" to "+destination);
        towerOfHanoi(n-1, helper, source, destination);
    }
}
