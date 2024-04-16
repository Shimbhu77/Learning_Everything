public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,9,11,14,16,17};
        System.out.println(binarySearch(arr,0,arr.length-1, 7));
        System.out.println(binarySearch(arr,0,arr.length-1, 8));
        System.out.println(binarySearchAnotherImplementation(arr,0,arr.length-1, 7));
        System.out.println(binarySearchAnotherImplementation(arr,0,arr.length-1, 8));
    }

    public static int binarySearch(int[] arr,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }

        int mid = start+(end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]<target)
        {
            start = mid+1;
        }
        else
        {
            end = mid-1;
        }

        return binarySearch(arr, start, end, target);
    }

    public static int binarySearchAnotherImplementation(int[] arr,int start,int end,int target)
    {
        if(start>end)
        {
            return -1;
        }

        int mid = start+(end-start)/2;

        if(arr[mid]==target)
        {
            return mid;
        }
        else if(arr[mid]<target)
        {
            return binarySearch(arr, mid+1, end, target);
        }
        else
        {
            return binarySearch(arr, start, mid-1, target);
        }
    
    }
}
