public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {1,4,7,5,8,9};
        int n = arr.length;
        int index = 0;
        System.out.println("correct order sum from index 1 to n : ");
        System.out.println(sumOfArrayElementInCorrectOrder(arr, index, n));
        System.out.println("reverse order sum from index n to 1 : ");
        System.out.println(sumOfArrayElementInReverseOrder(arr,n-1));
        
    }

    // correct order sum
    public static int sumOfArrayElementInCorrectOrder(int[] arr,int index,int n)
    {
        if(index == n-1)
        {
            return arr[index];
        }

        return arr[index]+sumOfArrayElementInCorrectOrder(arr, index+1, n);
    }

    // reverse order sum
    public static int sumOfArrayElementInReverseOrder(int[] arr,int index)
    {
        if(index == 0)
        {
            return arr[index];
        }

        return arr[index]+sumOfArrayElementInReverseOrder(arr, index-1);
    }
}
