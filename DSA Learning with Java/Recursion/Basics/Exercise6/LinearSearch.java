public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,8,6,9};
        System.out.println(linearSearch(arr, arr.length-1, 6));
        System.out.println(linearSearch(arr, arr.length-1, 7));
    }

    public static int linearSearch(int[] arr,int index,int target)
    {
        if(index==-1)
        {
            return -1;
        }

        if(arr[index]==target)
        {
            return index;
        }

        return linearSearch(arr, index-1, target);
    }
}
