public class FindMinElementInArray {
    public static void main(String[] args) {
        int[] arr = {5,7,3,6,2,8};
        int n = arr.length;
        int index = 0;

        System.out.println("Minimum Element : "+minElement(arr, index, n));
        System.out.println("Maximum Element : "+maxElement(arr, index, n));
        System.out.println("reverse order : ------------------------");
        System.out.println("Minimum Element : "+minElementFromReverse(arr, n-1));
        System.out.println("Maximum Element : "+maxElementFromReverse(arr,n-1));
    }

    // correct ordere 1 to n index
    public static int minElement(int[] arr,int index,int n)
    {
        if(index == n-1)
        {
            return arr[index];
        }
        
        return Math.min(arr[index],minElement(arr, index+1, n));
    }

    public static int maxElement(int[] arr,int index,int n)
    {
        if(index == n-1)
        {
            return arr[index];
        }
        
        return Math.max(arr[index],maxElement(arr, index+1, n));
    }


    // reverse ordere n to 1 index
    public static int minElementFromReverse(int[] arr,int index)
    {
        if(index == 0)
        {
            return arr[index];
        }
          
        return Math.min(arr[index],minElementFromReverse(arr, index-1));
    }

    public static int maxElementFromReverse(int[] arr,int index)
    {
        if(index == 0)
        {
            return arr[index];
        }
        
        return Math.max(arr[index],maxElementFromReverse(arr, index-1));
    }
}
