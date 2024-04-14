public class IterateArray {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,8};
        int n = 5;
        int index = 0;
        System.out.println("correct order index 1 to n : ");
        traverseArray(arr, index, n);
        System.out.println("reverse order index n to 1 : ");
        reverseTraverseArray(arr,n-1);
    }

    // 1 to n index - correct order
    public static void traverseArray(int[] arr,int index,int n)
    {
          
        if(index == n)
        {
            return;
        }
        // correct order
        System.out.println(arr[index]); 
        traverseArray(arr, index+1, n);

        // reverse order
        // traverseArray(arr, index+1, n);
        // System.out.println(arr[index]); 
        
    }

    // reverse order
    public static void reverseTraverseArray(int[] arr,int index)
    {
        if(index==-1)
        {
            return;
        }
        
        // correct order
        // System.out.println(arr[index]);
        // reverseTraverseArray(arr, index-1);

        // reverse order
        reverseTraverseArray(arr, index-1);
        System.out.println(arr[index]);
    }
}
