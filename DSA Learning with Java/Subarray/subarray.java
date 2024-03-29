import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subarray {
     public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        int n = arr.length;
        System.out.println("arr : "+Arrays.toString(arr));
        findAllSubarrays(arr, n);
        
    }
    
    public static void findAllSubarrays(int arr[], int n){
        
        for(int i=0;i<n;i++)
        {
            List<Integer> list = new ArrayList<>();
            for(int j=i;j<n;j++)
            {
                list.add(arr[j]);
                System.out.println(list);
            }
        }

    }


}
