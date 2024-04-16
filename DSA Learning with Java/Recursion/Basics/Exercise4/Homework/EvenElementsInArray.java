import java.util.ArrayList;
import java.util.List;

public class EvenElementsInArray {
    
    public static void main(String[] args) {
        int[] arr = {2,5,1,7,6,8};
        List<Integer> list = new ArrayList<>();
        System.out.println(evenElements(arr, arr.length-1,list));
    }

    public static List<Integer> evenElements(int[] arr,int index,List<Integer> list)
    {
        
        if(index == 0)
        {
            list.add(arr[index]);
            return list;
        }
        
        if(arr[index]%2==0)
        {
          list.add(arr[index]);
        }

        return evenElements(arr, index-1, list);
    }



}
