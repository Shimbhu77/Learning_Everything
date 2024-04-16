public class ProductOfArrayElements {
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,6,8};
        
        System.out.println(product(arr, arr.length-1));
    }

    public static int product(int[] arr,int index)
    {
        if(index == 0)
        {
            return arr[index];
        }

        return arr[index] * product(arr, index-1);
    }


}
